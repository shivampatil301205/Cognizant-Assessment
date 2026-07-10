# LibraryManagement (Exercise 9)

## Objective
Create a complete Spring Boot application named **LibraryManagement** to demonstrate CRUD operations using Spring MVC and Spring Data JPA with an H2 in-memory database.

## Scenario
A small library system needs a REST API to manage books. The application should persist data using JPA and automatically load sample data on startup.

## Technologies Used
- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- JUnit (Spring Boot Test)

## Spring Boot Dependencies
- spring-boot-starter-web
- spring-boot-starter-data-jpa
- com.h2database:h2
- spring-boot-starter-test

## Project Structure
```
SCM_MavenProject/
  pom.xml
  README.md
  src/
    main/
      java/
        com/example/librarymanagement/
          LibraryManagementApplication.java
          controller/BookController.java
          entity/Book.java
          repository/BookRepository.java
          service/BookService.java
      resources/
        application.properties
        data.sql
    test/
      java/
        com/example/librarymanagement/
          LibraryManagementApplicationTests.java
```

## Folder Structure
- `src/main/java`: Application code
- `src/main/resources`: Configuration and SQL seed data
- `src/test/java`: Tests

## Features
- Full CRUD REST API for books
- H2 database with sample records loaded at startup
- H2 console enabled for inspection

## REST API Endpoints
### GET `/books`
Returns all books.

### GET `/books/{id}`
Returns a single book by id.

### POST `/books`
Creates a new book.

### PUT `/books/{id}`
Updates an existing book by id.

### DELETE `/books/{id}`
Deletes a book by id.

## Database Configuration
Configured in `src/main/resources/application.properties` using:
- H2 in-memory database
- Hibernate auto DDL
- SQL logging
- H2 console enabled

## Sample Data
`src/main/resources/data.sql` contains sample books that are inserted automatically on startup.

## Maven Commands
- Build: `mvn clean package`
- Run: `mvn spring-boot:run`
- Test: `mvn test`

## Installation Steps
1. Open the project folder in VS Code.
2. Ensure JDK 17 is installed.
3. Allow Maven to download dependencies.

## Build Instructions
Run:
- `mvn clean compile`
- `mvn clean package`

## Run Instructions
Run:
- `mvn spring-boot:run`

Application URL:
- http://localhost:8080/books

H2 Console URL:
- http://localhost:8080/h2-console

## Testing Using Postman
### GET
- `GET http://localhost:8080/books`
- `GET http://localhost:8080/books/1`

### POST
- `POST http://localhost:8080/books`
Body:
- JSON with `title`, `author`, `price`

### PUT
- `PUT http://localhost:8080/books/1`
Body:
- JSON with updated `title`, `author`, `price`

### DELETE
- `DELETE http://localhost:8080/books/1`

## H2 Database Access
1. Open: http://localhost:8080/h2-console
2. Use the configured JDBC URL from `application.properties`
3. Click **Connect**

## Expected Output
- Server starts successfully.
- Sample books are available at `GET /books`.

## Learning Outcomes
- Build and run a Spring Boot REST API.
- Use Spring Data JPA for CRUD operations.
- Configure an H2 database and seed initial data with `data.sql`.

## Conclusion
The **LibraryManagement** project provides a working REST API backed by JPA and H2 with preloaded sample data.

Author

Shivam Patil

