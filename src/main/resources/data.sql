INSERT into GROUPS values (1, 'IO1');
INSERT into GROUPS values (2, 'IO2');
INSERT into GROUPS values (3, 'IO3');
INSERT into GROUPS values (4, 'IO4');
INSERT into GROUPS values (5, 'IO5');
INSERT into GROUPS values (6, 'IO6');

INSERT INTO ROLES(role_type) VALUES ('ADMIN');
INSERT INTO ROLES(role_type) VALUES ('STUDENT');
INSERT INTO ROLES(role_type) VALUES ('TEACHER');

INSERT INTO USERS VALUES (1, 'ekoGroszek@wp.pl', '12345', 2);
INSERT INTO USERS VALUES (2, 'xewionn@wp.pl', '12345', 2);

INSERT INTO USERS VALUES (3, 'profesor@wp.pl', '12345', 3);
INSERT INTO USERS VALUES (4, 'doktor@wp.pl', '12345', 3);

INSERT INTO USERS VALUES (5, 'admin@wp.pl', '12345', 1);


INSERT INTO USERS VALUES (6, 'student6@wp.pl', '12345', 2);
INSERT INTO USERS VALUES (7, 'student7@wp.pl', '12345', 2);
INSERT INTO USERS VALUES (8, 'student8@wp.pl', '12345', 2);
INSERT INTO USERS VALUES (9, 'student9@wp@wp.pl', '12345', 2);
INSERT INTO USERS VALUES (10, 'student10@wp.pl', '12345', 2);
INSERT INTO USERS VALUES (11, 'student11@wp.pl', '12345', 2);
INSERT INTO USERS VALUES (12, 'kamil123@wp.pl', '$2a$10$xNZ1Ic.mBjtq6kuPhJX0TeYPLRsPI2404QznqSs8hQ9j7gAONAgrq', 2);


INSERT INTO SUBJECT VALUES(1, 'Matematyka Dyskretna', 6);

INSERT INTO SUBJECT VALUES(2, 'Analiza Matematyczna', 5);
INSERT INTO SUBJECT VALUES(3, 'Podstawy Programowania', 4);


INSERT INTO TEACHER(name,salary,user) VALUES ('profesor',15000, 3);



-- INSERT INTO STUDENTS(DISPLAY_NAME, address, city, province, zip_code, phone_number, user)
--   VALUES ('Wiktor', 'szkolna 11', 'uć', 'lodzkie', '12-345', '123123123',  1);
-- INSERT INTO STUDENTS(DISPLAY_NAME, address, city, province, zip_code, phone_number, user)
--   VALUES ('Kamil', 'szkolna 11', 'uć', 'lodzkie', '12-345', '123123123',  2);

INSERT INTO STUDENTS(DISPLAY_NAME, address, city, province, zip_code, phone_number, user, group_id)
  VALUES ('Wiktor', 'szkolna 11', 'uć', 'lodzkie', '12-345', '123123123',  1, 1);
INSERT INTO STUDENTS(DISPLAY_NAME, address, city, province, zip_code, phone_number, user, group_id)
  VALUES ('Kamil', 'szkolna 11', 'uć', 'lodzkie', '12-345', '123123123',  2, 1);
  INSERT INTO STUDENTS(DISPLAY_NAME, address, city, province, zip_code, phone_number, user, group_id)
  VALUES ('Wiktorgr2', 'szkolna 11', 'uć', 'lodzkie', '12-345', '123123123',  1, 2);
INSERT INTO STUDENTS(DISPLAY_NAME, address, city, province, zip_code, phone_number, user, group_id)
  VALUES ('Kamilgr3', 'szkolna 11', 'uć', 'lodzkie', '12-345', '123123123',  2, 3);

INSERT INTO STUDENTS(DISPLAY_NAME, address, city, province, zip_code, phone_number, user, group_id)
  VALUES ('Kamil Żarski', 'szkolna 11', 'uć', 'lodzkie', '12-345', '123123123',  12, 3);

INSERT INTO GRADE(VALUE_GRADE, DATE_RECEIVED, STUDENT_ID, TEACHER_ID,SUBJECT_ID) VALUES (5, '12/08/1948',1,1,1);
INSERT INTO GRADE(VALUE_GRADE, DATE_RECEIVED, STUDENT_ID, TEACHER_ID,SUBJECT_ID) VALUES (5, '12/08/1948',1,1,1);
INSERT INTO GRADE(VALUE_GRADE, DATE_RECEIVED, STUDENT_ID, TEACHER_ID,SUBJECT_ID) VALUES (5, '12/08/1948',1,1,1);

INSERT INTO GRADE(VALUE_GRADE, DATE_RECEIVED, STUDENT_ID, TEACHER_ID,SUBJECT_ID) VALUES (5, '12/08/1948',2,1,1);
INSERT INTO GRADE(VALUE_GRADE, DATE_RECEIVED, STUDENT_ID, TEACHER_ID,SUBJECT_ID) VALUES (5, '12/08/1948',2,1,1);

INSERT INTO GRADE(VALUE_GRADE, DATE_RECEIVED, STUDENT_ID, TEACHER_ID,SUBJECT_ID) VALUES (5, '12/08/1948',5,1,1);
INSERT INTO GRADE(VALUE_GRADE, DATE_RECEIVED, STUDENT_ID, TEACHER_ID,SUBJECT_ID) VALUES (5, '12/08/1948',5,1,1);
