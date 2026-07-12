# Week 4 - Microservices (Account & Loan)

## Overview

This project demonstrates the basics of Microservices using Spring Boot. Two independent RESTful web services are created:

- **Account Microservice** – Provides account details.
- **Loan Microservice** – Provides loan details.

Both services work independently and return dummy JSON responses without using a database.

---

## Technologies Used

- Java 17
- Spring Boot
- Spring Web
- Maven
- Spring Boot DevTools

---

## Project Structure

```
Week 4
└── microservices
    ├── account
    └── loan
```

Each project has its own:
- `pom.xml`
- Controller
- Model
- Application class

---

## Account Microservice

### Endpoint

```
GET /accounts/{number}
```

### Example

```
http://localhost:8080/accounts/00987987973432
```

### Sample Response

```json
{
  "number": "00987987973432",
  "type": "savings",
  "balance": 234343
}
```

---

## Loan Microservice

### Endpoint

```
GET /loans/{number}
```

### Example

```
http://localhost:8081/loans/L001
```

### Sample Response

```json
{
  "number": "L001",
  "type": "car",
  "loan": 400000,
  "emi": 3258,
  "tenure": 18
}
```

---

## How to Run

### Account Microservice

```bash
cd account
mvn clean package
mvn spring-boot:run
```

Runs on:

```
http://localhost:8080
```

---

### Loan Microservice

```bash
cd loan
mvn clean package
mvn spring-boot:run
```

Runs on:

```
http://localhost:8081
```

> **Note:** The Loan service uses port **8081** because the Account service already runs on port **8080**.

---

## Learning Outcome

Through this exercise, I learned how to:

- Create independent Spring Boot microservices.
- Build REST APIs using Spring Boot.
- Return JSON responses using REST controllers.
- Configure different server ports for multiple services.
- Test REST endpoints using a web browser.

---

## Author

**Shivam Patil**