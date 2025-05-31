Student Management System
Description
Application web pour la gestion des étudiants avec un backend Spring Boot (API REST CRUD) et un frontend Angular. Le backend utilise MariaDB pour stocker les données des étudiants (ID, prénom, nom, email). Le frontend permet d'afficher, ajouter, modifier et supprimer des étudiants via une interface utilisateur simple.
Prérequis

Backend :
Java 17
Maven
MariaDB (base de données student_db, utilisateur nick, mot de passe passer)


Frontend :
Node.js et npm
Angular CLI 18+



Installation
Backend

Clonez le dépôt :git clone https://github.com/nospi510/student-management.git
cd student-management


Configurez MariaDB :CREATE DATABASE student_db;
CREATE USER 'nick'@'localhost' IDENTIFIED BY 'passer';
GRANT ALL PRIVILEGES ON student_db.* TO 'nick'@'localhost';
FLUSH PRIVILEGES;


Lancez le backend :cd backend
./mvnw spring-boot:run


Accédez à l'API via Swagger : http://localhost:8080/swagger-ui/index.html

Frontend

Naviguez dans le dossier frontend :cd student-frontend


Installez les dépendances :npm install


Lancez le frontend :ng serve


Ouvrez http://localhost:4200 dans un navigateur.

Fonctionnalités

Backend :
API REST pour gérer les étudiants (GET, POST, PUT, DELETE).
Documentation Swagger.
Persistance des données dans MariaDB.


Frontend :
Liste des étudiants avec options pour ajouter, modifier, supprimer.
Formulaire pour saisir les informations des étudiants.



Technologies

Backend : Spring Boot 3.3.4, Spring Data JPA, MariaDB, Swagger (Springdoc)
Frontend : Angular 18 (standalone), HttpClient
Environnement : Ubuntu, VS Code

Utilisation

Ajoutez un étudiant via le formulaire sur http://localhost:4200.
Modifiez ou supprimez un étudiant via les boutons dans la liste.
Testez les endpoints via Swagger ou un outil comme Postman.

Contributeurs

Nick (développeur principal)

