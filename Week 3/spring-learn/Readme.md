# Spring Learn - Week 3

## Author
**Shivam Patil**

---

# Project Overview

This repository contains the implementation of **Week 3 Spring Framework exercises** from the DeepSkilling program. The project demonstrates the fundamentals of Spring Boot and Spring Core, including REST API development, XML-based bean configuration, dependency injection, logging, bean management, service layer implementation, and JSON response generation using Spring MVC.

---

# Exercises Included

## 1. Spring Web Project using Maven

### Objective

Develop a basic Spring Boot web application using Maven and expose a simple REST endpoint.

### Features

- Spring Boot project created using Maven
- Spring Web dependency configuration
- REST Controller implementation
- Embedded Tomcat server
- Spring Boot application setup
- Basic REST endpoint creation

### Technologies Used

- Java 17
- Spring Boot 3.x
- Spring Web
- Maven
- Embedded Tomcat
- VS Code

### Output

```
Welcome to Spring Boot!
```

---

## 2. Spring Core – Load Country from Spring Configuration XML

### Objective

Demonstrate Spring Core concepts by loading a bean from an XML configuration file and retrieving it using the Spring IoC Container.

### Features

- XML-based bean configuration
- Country bean creation
- Property Injection
- Spring IoC Container
- ClassPathXmlApplicationContext
- Bean retrieval using `context.getBean()`
- Logging using SLF4J

### Country Configured

| Code | Name |
|------|------|
| IN | India |

### Output

```
Inside Country Constructor.
Inside setCode()
Inside setName()
Country : Country [code=IN, name=India]
```

---

## 3. Hello World RESTful Web Service

### Objective

Develop a RESTful web service that returns a simple **"Hello World!!"** response using Spring Web Framework.

### Features

- REST Controller implementation
- GET endpoint using `@GetMapping("/hello")`
- Logging using SLF4J
- HTTP GET request handling
- Plain text response generation

### Endpoint

```
GET /hello
```

### Sample Response

```
Hello World!!
```

### Logging Output

```
START - sayHello()
END - sayHello()
```

---

## 4. REST – Country Web Service

### Objective

Develop a RESTful web service that retrieves the **Country** bean from the Spring XML configuration file and returns it as a JSON response.

### Features

- REST Controller implementation
- REST endpoint using `@RequestMapping`
- Retrieves Country bean from Spring IoC Container
- XML-based Spring bean configuration
- Automatic JSON serialization using Spring Boot
- Spring MVC integration

### Endpoint

```
GET /country
```

### Sample Response

```json
{
  "code": "IN",
  "name": "India"
}
```

---

## 5. REST – Get Country Based on Country Code

### Objective

Develop a RESTful web service that returns a country based on the country code provided in the URL. The country code lookup is case-insensitive and the business logic is implemented using a separate Service layer.

### Features

- Service Layer implementation using `@Service`
- Dependency Injection using `@Autowired`
- Path Variable handling using `@PathVariable`
- Case-insensitive country code search
- Business logic separated from Controller
- Automatic JSON serialization
- Spring MVC architecture

### Endpoint

```
GET /country/{code}
```

### Sample Requests

```
GET /country/in
GET /country/IN
GET /country/In
```

### Sample Response

```json
{
  "code": "IN",
  "name": "India"
}
```

---

# Project Structure

```text
spring-learn
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── cognizant
│   │   │           └── spring_learn
│   │   │               ├── SpringLearnApplication.java
│   │   │               ├── Country.java
│   │   │               ├── controller
│   │   │               │     ├── HelloController.java
│   │   │               │     └── CountryController.java
│   │   │               └── service
│   │   │                     └── CountryService.java
│   │   │
│   │   └── resources
│   │       ├── application.properties
│   │       └── country.xml
│   │
│   └── test
│
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md
```

---

# Spring Concepts Covered

## Spring Web Project using Maven

- Spring Boot
- Maven Project Structure
- Spring Web
- REST Controller
- Request Mapping
- Embedded Tomcat

## Spring Core – Load Country from Spring Configuration XML

- Spring Core
- Inversion of Control (IoC)
- XML Bean Configuration
- Dependency Injection
- Setter Injection
- Bean Lifecycle
- ApplicationContext
- ClassPathXmlApplicationContext
- Bean Retrieval
- Logging with SLF4J

## Hello World RESTful Web Service

- RESTful Web Services
- Spring MVC
- REST Controller
- HTTP GET Mapping
- URL Mapping
- Request Handling
- Response Generation
- Logging with SLF4J

## REST – Country Web Service

- RESTful Web Services
- Spring MVC
- `@RestController`
- `@RequestMapping`
- JSON Serialization
- Spring IoC Container
- XML Bean Configuration
- Bean Retrieval

## REST – Get Country Based on Country Code

- Service Layer Architecture
- `@Service`
- `@Autowired`
- `@PathVariable`
- Dependency Injection
- REST API Development
- Case-insensitive Search
- Business Logic Separation
- JSON Serialization

---

# How to Run

## Clone the Repository

```bash
git clone https://github.com/shivampatil301205/Cognizant-Assessment.git
```

## Navigate to the Project

```bash
cd spring-learn
```

## Run the Application

```bash
./mvnw spring-boot:run
```

or

```bash
mvn spring-boot:run
```

The application runs on:

```
http://localhost:8083
```

---

## Available Endpoints

| Method | Endpoint | Description |
|---------|----------|-------------|
| GET | `/hello` | Returns Hello World text |
| GET | `/country` | Returns India country details in JSON |
| GET | `/country/{code}` | Returns country details based on the country code (case-insensitive) |

---

# Learning Outcomes

By completing these exercises, the following concepts were implemented and understood:

- Spring Boot application development using Maven
- Spring Web fundamentals
- Spring MVC architecture
- REST API development
- RESTful Web Services
- HTTP Request Mapping
- XML-based Bean Configuration
- Spring IoC Container
- Dependency Injection
- Setter Injection
- Bean creation and retrieval
- Logging using SLF4J
- Returning Java objects as JSON
- Service Layer implementation
- Dependency Injection using `@Autowired`
- URL Path Variable handling
- Case-insensitive search implementation
- Separation of Controller and Service layers
- Spring Boot application execution

---

# Developed By

**Shivam Patil**