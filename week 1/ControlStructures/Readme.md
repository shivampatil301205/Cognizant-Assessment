# PL/SQL Control Structures (MySQL Implementation)

## Exercise 1 - Control Structures

### Objective

This project demonstrates the implementation of banking operations using MySQL. It simulates customer and loan management through conditional updates, date-based calculations, and query processing.

---

## Features

- Customer management
- Loan management
- Interest rate discount for senior citizens
- VIP customer promotion
- Loan payment reminder generation
- Date-based filtering and calculations

---

## Problem Statement

Manage customer and loan records by performing the following operations:

- Apply a 1% interest rate discount for customers older than 60 years.
- Promote customers with a balance greater than ₹10,000 to VIP status.
- Generate reminders for loans due within the next 30 days.

---

## Database Schema

### Customers

| Column | Data Type |
|---------|-----------|
| CustomerID | INT |
| Name | VARCHAR(50) |
| DOB | DATE |
| Balance | DECIMAL(10,2) |
| IsVIP | VARCHAR(5) |

### Loans

| Column | Data Type |
|---------|-----------|
| LoanID | INT |
| CustomerID | INT |
| LoanAmount | DECIMAL(10,2) |
| InterestRate | DECIMAL(4,2) |
| DueDate | DATE |

---

## Operations Implemented

### Scenario 1 – Interest Rate Discount

Customers older than 60 years receive a 1% reduction in their loan interest rate.

### Scenario 2 – VIP Promotion

Customers with an account balance greater than ₹10,000 are promoted to VIP status.

### Scenario 3 – Loan Payment Reminder

Displays reminder messages for customers whose loan due dates fall within the next 30 days.

---

## Technologies Used

- MySQL
- SQL
- Conditional Statements
- JOIN Operations
- Date Functions

---

## SQL Concepts Used

- CREATE TABLE
- INSERT INTO
- UPDATE
- SELECT
- INNER JOIN
- TIMESTAMPDIFF()
- CURDATE()
- DATE_ADD()
- DATE_FORMAT()
- CONCAT()

---

## Project Structure

```text
PLSQL_ControlStructures/
│
├── ControlStructures.sql
└── README.md
```

---

## Sample Data

### Customers

| CustomerID | Name | Balance |
|------------|------|---------|
| 1 | John Doe | 5000 |
| 2 | Jane Smith | 12000 |
| 3 | Bob Johnson | 15000 |

### Loans

| LoanID | Interest Rate |
|--------|---------------|
| 101 | 8.50 |
| 102 | 6.00 |
| 103 | 7.50 |

---

## Expected Output

### Customers

```text
CustomerID  Name         Balance    IsVIP
1           John Doe      5000      FALSE
2           Jane Smith   12000      TRUE
3           Bob Johnson  15000      TRUE
```

### Loans

```text
LoanID   CustomerID   InterestRate
101      1            7.50
102      2            6.00
103      3            6.50
```

### Loan Reminders

```text
Reminder: Customer John Doe has loan 101 due on 2026-07-03
```

---

## How to Run

1. Open a MySQL environment (MySQL Workbench, OneCompiler, etc.).
2. Execute the `ControlStructures.sql` file.
3. View the updated customer and loan records.
4. Check the generated loan reminder messages.

---

## Learning Outcomes

- Perform CRUD operations in MySQL
- Work with relational database tables
- Use JOIN operations
- Perform conditional updates
- Handle date calculations
- Generate formatted query results
- Apply SQL concepts to real-world banking scenarios

---

## Author

**Shivam Patil**