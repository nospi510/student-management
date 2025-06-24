# 🎓 Student Management System

Une application web de gestion des étudiants avec :

- 🔧 Backend en **Spring Boot** (API REST CRUD)
- 🎨 Frontend en **Angular**
- 💾 Base de données **MariaDB**

Permet de **créer, lire, modifier et supprimer** des étudiants via une interface simple.

---

## ✅ Prérequis

### 🔙 Backend

| Outil | Version |
|-------|---------|
| Java | 17 |
| Maven | Dernière version |
| MariaDB | Installé et configuré |

### 🖥️ Frontend

| Outil | Version |
|-------|---------|
| Node.js | ≥ 18 |
| npm | ≥ 9 |
| Angular CLI | ≥ 18 |

---

## 🔧 Installation

### 🚀 Backend

1. **Cloner le dépôt** :

```bash
git clone https://github.com/nospi510/student-management.git
cd student-management
````

2. **Configurer MariaDB** :

```sql
CREATE DATABASE student_db;

CREATE USER 'nick'@'localhost' IDENTIFIED BY 'passer';

GRANT ALL PRIVILEGES ON student_db.* TO 'nick'@'localhost';

FLUSH PRIVILEGES;
```

3. **Lancer le backend** :

```bash
cd backend
./mvnw spring-boot:run
```

4. **Accéder à l’API via Swagger** :

👉 [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)

---

### 🌐 Frontend

1. **Aller dans le dossier frontend** :

```bash
cd student-frontend
```

2. **Installer les dépendances** :

```bash
npm install
```

3. **Lancer le serveur Angular** :

```bash
ng serve
```

4. **Accéder à l’application** :

👉 [http://localhost:4200](http://localhost:4200)

---

## 🧩 Fonctionnalités

### 🔙 Backend

* API REST :

  * `GET /students`
  * `POST /students`
  * `PUT /students/{id}`
  * `DELETE /students/{id}`
* Documentation Swagger
* Persistance via Spring Data JPA & MariaDB

### 🌐 Frontend

* Affichage de la liste des étudiants
* Formulaire pour ajouter un étudiant
* Boutons pour modifier et supprimer

---

## ⚙️ Technologies

| Côté          | Technologies                                                     |
| ------------- | ---------------------------------------------------------------- |
| Backend       | Spring Boot 3.3.4, Spring Data JPA, MariaDB, Swagger (Springdoc) |
| Frontend      | Angular 18 (standalone), Angular HttpClient                      |
| Environnement | Ubuntu, VS Code                                                  |

---

## ▶️ Utilisation

* Accéder à [http://localhost:4200](http://localhost:4200)
* Ajouter un étudiant via le formulaire
* Modifier ou supprimer un étudiant depuis la liste
* Tester l’API via Swagger ou Postman

---

## 👨‍💻 Contributeur

* **Nick** – Développeur principal ✨
  [https://github.com/nospi510](https://github.com/nospi510)


