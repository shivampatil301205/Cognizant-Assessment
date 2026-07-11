# JWT Authentication Service

## Author
**Shivam Patil**

---

# Project Overview

This project demonstrates the implementation of a **JWT (JSON Web Token) Authentication Service** using **Spring Boot** and **Spring Security**. The application authenticates users using Basic Authentication and generates a JWT token that can be used for securing REST APIs.

---

# Objective

Develop a Spring Boot authentication service that:

- Authenticates users using Spring Security
- Reads the Authorization header
- Decodes Basic Authentication credentials
- Generates a JWT token
- Returns the token as a JSON response

---

# Features

- Spring Boot REST Application
- Spring Security Integration
- JWT Token Generation
- Basic Authentication
- REST Controller
- JSON Response
- Embedded Tomcat Server
- Maven Project Structure

---

# Technologies Used

- Java 17
- Spring Boot 3.x
- Spring Web
- Spring Security
- JJWT (Java JWT)
- Maven
- Embedded Tomcat
- VS Code

---

# Project Structure

```
jwt-authentication-service
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── cognizant
│   │   │           └── jwt_authentication_service
│   │   │               ├── JwtAuthenticationServiceApplication.java
│   │   │               │
│   │   │               ├── controller
│   │   │               │     └── AuthenticationController.java
│   │   │               │
│   │   │               ├── model
│   │   │               │     └── AuthenticationResponse.java
│   │   │               │
│   │   │               └── util
│   │   │                     └── JwtUtil.java
│   │   │
│   │   └── resources
│   │         └── application.properties
│   │
│   └── test
│
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md
```

---

# API Endpoint

## Generate JWT Token

**Request**

```
GET /authenticate
```

Authentication is performed using **Basic Authentication**.

Example:

```bash
curl -u user:<password> http://localhost:8090/authenticate
```

---

# Sample Response

```json
{
    "token":"eyJhbGciOiJIUzI1NiJ9..."
}
```

The generated JWT token is unique for every successful authentication request.

---

# How JWT Generation Works

1. Client sends a request with Basic Authentication credentials.
2. Spring Security authenticates the user.
3. The Authorization header is decoded.
4. Username is extracted.
5. JWT token is generated using the secret key.
6. Token is returned in JSON format.

---

# Learning Concepts Covered

- Spring Boot REST APIs
- Spring Security
- Basic Authentication
- HTTP Authorization Header
- Base64 Decoding
- JWT Token Generation
- REST Controller
- JSON Response Handling
- Maven Project Structure

---

# How to Run

## Clone the Repository

```bash
git clone <repository-url>
```

## Navigate to the Project

```bash
cd jwt-authentication-service
```

## Build the Project

```bash
mvn clean install
```

## Run the Application

```bash
mvn spring-boot:run
```

The application starts on:

```
http://localhost:8090
```

---

# Testing the API

Using cURL:

```bash
curl -u user:<password> http://localhost:8090/authenticate
```

Expected Output:

```json
{
    "token":"<generated-jwt-token>"
}
```

---

# Learning Outcomes

After completing this project, the following concepts were implemented and understood:

- Spring Boot Application Development
- REST API Creation
- Spring Security Authentication
- Basic Authentication
- JWT Token Generation
- HTTP Request Header Processing
- Base64 Credential Decoding
- JSON Response Generation
- Maven Project Management

---

# Developed By

**Shivam Patil**