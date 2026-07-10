# Spring Data JPA - Quick Example

## Project Name
ORM Learn - Spring Data JPA Quick Example

## Description
This project demonstrates the basic implementation of Spring Data JPA with Spring Boot and MySQL. It retrieves data from a MySQL database using JPA Repository without writing SQL queries manually. The application fetches all records from the `country` table and displays them in the console using a service layer.

## Features
- Spring Boot application setup
- Spring Data JPA integration
- MySQL database connectivity
- Entity mapping using JPA annotations
- Repository interface using JpaRepository
- Service layer implementation
- Logging using SLF4J
- Retrieve all countries from the database

## Technologies Used
- Java 17
- Spring Boot 3.5.16
- Spring Data JPA
- Hibernate
- MySQL 8.0
- Maven
- VS Code
- SLF4J Logger

## Project Structure

```
orm-learn
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── cognizant
│   │   │           └── ormlearn
│   │   │               ├── model
│   │   │               │   └── Country.java
│   │   │               ├── repository
│   │   │               │   └── CountryRepository.java
│   │   │               ├── service
│   │   │               │   └── CountryService.java
│   │   │               └── OrmLearnApplication.java
│   │   │
│   │   └── resources
│   │       └── application.properties
│   │
│   └── test
│
├── pom.xml
└── README.md
```

## Database Setup

Create the database:

```sql
CREATE DATABASE ormlearn;
```

Use the database:

```sql
USE ormlearn;
```

Create the table:

```sql
CREATE TABLE country (
    code VARCHAR(2) PRIMARY KEY,
    name VARCHAR(50)
);
```

Insert sample records:

```sql
INSERT INTO country VALUES ('IN','India');
INSERT INTO country VALUES ('US','United States of America');
```

## Application Configuration

Configure the database connection in:

```
src/main/resources/application.properties
```

Example:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ormlearn
spring.datasource.username=root
spring.datasource.password=root

spring.jpa.hibernate.ddl-auto=validate
spring.jpa.show-sql=true
```

## How to Run

Open a terminal in the project directory.

Clean the project:

```bash
mvn clean
```

Compile the project:

```bash
mvn compile
```

Run the application:

```bash
mvn spring-boot:run
```

## Expected Output

```
Inside main
Start
Hibernate: select code,name from country
countries=[Country [code=IN, name=India], Country [code=US, name=United States of America]]
End
```

## Learning Outcomes

- Understand Spring Boot project structure
- Learn Entity creation using JPA annotations
- Connect Spring Boot with MySQL
- Implement Repository using JpaRepository
- Use Service layer for database operations
- Retrieve records using Spring Data JPA
- Configure application using application.properties
- Implement logging with SLF4J

## Author

**Shivam Patil**