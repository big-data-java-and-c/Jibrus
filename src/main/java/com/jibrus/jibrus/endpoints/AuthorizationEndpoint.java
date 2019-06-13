package com.jibrus.jibrus.endpoints;

import com.jibrus.jibrus.models.LoginForm;
import com.jibrus.jibrus.models.ResponseWithUserAndRole;
import com.jibrus.jibrus.models.SignUpForm;
import com.jibrus.jibrus.services.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "*", maxAge = 36000)
@RestController
@RequestMapping("/api/auth")
public class AuthorizationEndpoint {

    private UserDetailsServiceImpl userDetailsService;

    @Autowired
    public AuthorizationEndpoint(UserDetailsServiceImpl userDetailsService) {
        this.userDetailsService = userDetailsService;
    }


    @PostMapping("/signin")
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginForm loginForm) {

        ResponseWithUserAndRole response = userDetailsService.authenticateUser(loginForm);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/signup")
    public ResponseEntity<String> registerUser(@Valid @RequestBody SignUpForm signUpForm) {

        if (!userDetailsService.registerUser(signUpForm))
            return new ResponseEntity<>("Fail -> Email is already in use!", HttpStatus.BAD_REQUEST);


        return ResponseEntity.ok().body("User registered successfully!");
    }


}
