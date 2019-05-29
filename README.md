# Jibrus
Librus in Java and Spring
plik data.sql - wykonuje sie podczas startu aplikacji, wrzuca dane do servera sql
używamy h2, więc jest to wbudowana baza danych, po starcie aplikacji przechodzimy na:
http://localhost:8080/h2-console

Ustawiamy "JDBC URL" na :
jdbc:h2:mem:testdb

Tutaj możemy testować baze, zapytania, podglądać dane.


TO-Do and Done
Done:

Schemat bazy danych - Kamil
Wdrązenie modeli tabel, stworzenie relacji - Kamil
Wprowadzenie danych do bazy - Kamil

To-Do:
Logowanie - pobiera dane z tabeli USERS. moze byc problem bo hasło w tabeli nei jest szyfrowane, jak coś to zmienić.
dodać jakiś testowy endpoint(jeden już jest), i by 2 rózne role miały dostęp do innych endpointow - przetestować

Niewiem czy dobrze zrobilem plik data.sql, primary key niby są auto-increment, ale dane wsadzam w sposob taki:
insert into students values(....)
sprobowac wsadzic je tak:
insert into students(nazwaColumnyZImieniem,innaColumna) values(....)   - tutaj bez id, jeśli nie zadziała to trudno