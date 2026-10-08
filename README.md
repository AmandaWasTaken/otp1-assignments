# Assignment Objective  
---
My assignment was creating the backend for our project's dashboards.  
Key requirements
- Admin- and teacher accounts
- Student and course interfaces
- Ability for admins to create new teacher accounts
- Ability for admins to add students to database
- Ability for teachers to add students to courses  
- Login and log out functionality for teachers and admins  

# Techologies and Tools  
---
`javaFX`, `maven`, `JUnit`, `Jenkins`, `javac`   
`Java 21` with libraries `java.sql`, `java.time`, `java.crypto`, `java.security`

# Design Approach & Implementation
---
I created the `AdminDashboard` and `AccountInterface` classes which had methods to
add students to database, create teacher accounts, log in and out et cetera.
I also created a `TeacherDashboard` class to create courses and add students to them
I also created individual classes for `Student` and `Course`, and finally a utility
class for database actions and error handling. All of the aforementioned 
communicates with the database and frontend UI.  
Key decisions made during the implementation of the dashboards were ones that would
easily allow the backend and frontend communicate with each other  

# Testing & QA
--- 
Manual testing:
- Compile and run with `maven`
  - `mvn clean compile && mvn run:javafx`
  result: The project compiles with no errors and runs as expected

- Run unit tests (JUnit coverage ~90%)
  - `mvn clean compile && mvn test`
  result: All unit tests pass

# How to run
---
- Local method
  - Prerequisites: maven, java >= 17  
  - Build: `mvn clean compile`
  - Run:   `mvn run:javafx`

- Docker
  - Prerequisites: java >= 17, Docker
  - Build: `docker build -t <image> .` (Builds `marakusa/teacher-gradebook:latest`)
  - Run:   `docker run -d -p <port> <image>`


