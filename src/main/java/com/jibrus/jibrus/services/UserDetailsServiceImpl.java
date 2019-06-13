package com.jibrus.jibrus.services;


import com.jibrus.jibrus.daos.*;
import com.jibrus.jibrus.entities.*;
import com.jibrus.jibrus.models.LoginForm;
import com.jibrus.jibrus.models.ResponseWithUserAndRole;
import com.jibrus.jibrus.models.SignUpForm;
import com.jibrus.jibrus.models.UserPrinciple;
import com.jibrus.jibrus.security.JwtProvider;
import com.jibrus.jibrus.security.JwtResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


import java.util.Optional;
import java.util.logging.Logger;

@ComponentScan
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private UserDao userRepository;
    private JwtProvider jwtProvider;
    private AuthenticationManager authenticationManager;
    private PasswordEncoder encoder;
    private RoleService roleService;
    private TeacherDao teacherRepository;
    private StudentDao studentRepository;
    private static Logger logger = Logger.getLogger(UserDetailsServiceImpl.class.getName());

    @Autowired
    public UserDetailsServiceImpl(UserDao usersDaoTODELETE, JwtProvider jwtProvider, AuthenticationManager authenticationManager,
                                  PasswordEncoder passwordEncoder, RoleService roleService, StudentDao studentRepository, TeacherDao teacherRepository) {
        this.userRepository = usersDaoTODELETE;
        this.jwtProvider = jwtProvider;
        this.authenticationManager = authenticationManager;
        this.encoder = passwordEncoder;
        this.roleService = roleService;
        this.teacherRepository = teacherRepository;
        this.studentRepository = studentRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email)
            throws UsernameNotFoundException {

        Users user = userRepository.getByEmail(email)
                .orElseThrow(() ->
                        new UsernameNotFoundException("user not found with -> username or email : " + email)
                );

        return UserPrinciple.build(user);
    }

    public ResponseWithUserAndRole authenticateUser(LoginForm loginForm) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginForm.getEmail(),
                        loginForm.getPassword()
                )
        );

        SecurityContextHolder.getContext().setAuthentication(authentication);

        Optional<Users> username = userRepository.getByEmail(loginForm.getEmail());

        if (username.isPresent()) {
            logger.info("authorizeded user " + username.get().getEmail());
        } else throw new RuntimeException("unauthorized user");
        Users user = username.get();
        Long userId = user.getId();
        int roleId = user.getRole().getId();

        String jwt = jwtProvider.generateJwtToken(authentication);
        return new ResponseWithUserAndRole(new JwtResponse(jwt), roleId, userId);
    }

    public boolean registerUser(SignUpForm signUpForm) {
        if (userRepository.existsByEmail(signUpForm.getEmail())) {
            logger.info(signUpForm.getEmail() + " email already in use");
            return false;
        }

        Role role = roleService.getRole(signUpForm.getRole());
        Users user = new Users(signUpForm.getEmail(), encoder.encode(signUpForm.getPassword()), role);


        if (role.getName().equals(RoleName.TEACHER)) {
            Teacher teacher = new Teacher(signUpForm.getDisplayName(), user, signUpForm.getIndex());

            teacherRepository.save(teacher);
            logger.info(teacher.getName() + " teacher added");
        }

        if (role.getName().equals(RoleName.STUDENT)) {
            Students student = new Students(signUpForm.getDisplayName(), user, signUpForm.getIndex());
            System.out.println("Added student: " + student);
            studentRepository.save(student);
        }

        userRepository.save(user);
        logger.info(user.getEmail() + " user registered");
        return true;
    }

}
