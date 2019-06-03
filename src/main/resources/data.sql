INSERT into GROUPS values(1,'IO1');
INSERT into GROUPS values(2,'IO2');
INSERT into GROUPS values(3,'IO3');
INSERT into GROUPS values(4,'IO4');
INSERT into GROUPS values(5,'IO5');
INSERT into GROUPS values(6,'IO6');

INSERT INTO ROLES(role_type) VALUES('ADMIN');
INSERT INTO ROLES(role_type)VALUES('STUDENT');
INSERT INTO ROLES(role_type) VALUES('TEACHER');

INSERT INTO USERS VALUES(1,'ekoGroszek@wp.pl','12345',2);
INSERT INTO USERS VALUES(2,'xewionn@wp.pl','12345',2);

INSERT INTO USERS VALUES(3,'profesor@wp.pl','12345',3);
INSERT INTO USERS VALUES(4,'doktor@wp.pl','12345',3);

INSERT INTO USERS VALUES(5,'admin@wp.pl','12345',1);


INSERT INTO USERS VALUES(6,'student6@wp.pl','12345',2);
INSERT INTO USERS VALUES(7,'student7@wp.pl','12345',2);
INSERT INTO USERS VALUES(8,'student8@wp.pl','12345',2);
INSERT INTO USERS VALUES(9,'student9@wp@wp.pl','12345',2);
INSERT INTO USERS VALUES(10,'student10@wp.pl','12345',2);
INSERT INTO USERS VALUES(11,'student11@wp.pl','12345',2);

INSERT INTO STUDENTS VALUES(1, 'Politechniki 13' ,'Łódź' , 'Wiktor', 'Jachimczak' , '712 013 123', 'Łódzkie', '93-581',  1);
INSERT INTO STUDENTS VALUES(2, 'Pabinicka 3' ,'Łódź' , 'Kamil', 'Żarski' , '924856712', 'Łódzkie', '43-435',  2);
INSERT INTO STUDENTS VALUES(4, 'Aleje 3 Maja' ,'Łódź' , 'Klaudia', 'Frączkwoska' , '728462936', 'Łódzkie', '97-073', 6);

INSERT INTO STUDENTS VALUES(5, 'Politechniki 13' ,'Łódź' , 'Wiktor', 'Jachimczak' , '712 013 123', 'Łódzkie', '93-581',  7);
INSERT INTO STUDENTS VALUES(6, 'Pabinicka 3' ,'Łódź' , 'Kamil', 'Żarski' , '924856712', 'Łódzkie', '43-435', 8);
INSERT INTO STUDENTS VALUES(7, 'Piękna 69' ,'Łódź' , 'Zbyszek', 'Kielecki' , '987654321', 'Łódzkie', '38-819',  9);
INSERT INTO STUDENTS VALUES(8, 'Aleje 3 Maja' ,'Łódź' , 'Klaudia', 'Frączkwoska' , '728462936', 'Łódzkie', '97-073',  10);
INSERT INTO STUDENTS VALUES(3, 'Brzydka 9' ,'Łódź' , 'Tadeusz', 'Nowa' , '648148254', 'Łódzkie', '31-987', 11);

INSERT INTO TEACHER VALUES (1, 'profesor',15000, 'secondNameProfesor', 3);
INSERT INTO TEACHER VALUES (2, 'doktor',1500, 'secondNameDoktor', 4) ;

INSERT INTO SUBJECT VALUES(1, 'Matematyka Dyskretna', 6);
INSERT INTO SUBJECT VALUES(2, 'Podstawy Programowania', 3);
INSERT INTO SUBJECT VALUES(3, 'Inżyneria Wymagań', 4);
INSERT INTO SUBJECT VALUES(4, 'Bazy Danych', 5);
INSERT INTO SUBJECT VALUES(5, 'Testowanie Oprogramowania', 5);
INSERT INTO SUBJECT VALUES(6, 'Zarządzanie Firmą', 1);

INSERT INTO LESSON VALUES(1, '2019-05-29', 'E105', 3, 3, 1);
INSERT INTO LESSON VALUES(2, '2019-05-29', 'E103', 4, 6, 1);
INSERT INTO LESSON VALUES(3, '2019-05-29', 'E103', 3, 4, 2);
INSERT INTO LESSON VALUES(4, '2019-05-29', 'E105', 4, 1, 2);

INSERT INTO GRADE VALUES(1, '2019-05-29', 5, 2, 1, 2);