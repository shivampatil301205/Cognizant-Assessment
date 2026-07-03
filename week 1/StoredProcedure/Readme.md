# Library Management System – Stored Procedures (MySQL)

## Exercise 2 - Stored Procedures

### Objective

This project demonstrates the implementation of MySQL Stored Procedures in a Library Management System. It automates book inventory management, librarian salary updates, and book issuing operations using stored procedures.

---

## Features

- Book inventory management
- Member management
- Librarian salary updates
- Automatic restocking of low-stock books
- Book issue management
- Stored procedures with parameters
- Conditional logic using IF statements

---

## Problem Statement

Develop a Library Management System that performs the following operations:

- Automatically restock books with fewer than 5 available copies.
- Increase librarian salaries based on experience and bonus percentage.
- Issue books only if copies are available.

---

## Database Schema

### Books

| Column | Data Type |
|---------|-----------|
| BookID | INT |
| Title | VARCHAR(100) |
| Author | VARCHAR(50) |
| AvailableCopies | INT |
| LastUpdated | DATE |

### Members

| Column | Data Type |
|---------|-----------|
| MemberID | INT |
| Name | VARCHAR(50) |
| MembershipType | VARCHAR(20) |
| FineAmount | DECIMAL(10,2) |

### Librarians

| Column | Data Type |
|---------|-----------|
| LibrarianID | INT |
| Name | VARCHAR(50) |
| Experience | INT |
| Salary | DECIMAL(10,2) |

---

## Stored Procedures

### 1. RestockBooks()

Automatically adds 10 copies to every book having fewer than 5 available copies.

**Operations Performed**

- Checks available copies
- Updates inventory
- Updates last modified date
- Displays a success message

---

### 2. IncreaseSalary()

Updates librarian salaries based on:

- Minimum experience
- Bonus percentage

**Parameters**

- Experience
- Bonus Percentage

**Operations Performed**

- Filters librarians by experience
- Calculates updated salary
- Displays confirmation message

---

### 3. IssueBook()

Issues a book to a member only if copies are available.

**Parameters**

- Book ID
- Member ID

**Operations Performed**

- Checks available stock
- Decreases book quantity
- Updates last modified date
- Displays success or failure message

---

## Technologies Used

- MySQL
- SQL
- MySQL Stored Procedures
- Conditional Statements
- Date Functions

---

## SQL Concepts Used

- CREATE TABLE
- INSERT INTO
- UPDATE
- SELECT
- Stored Procedures
- Parameters
- IF...ELSE
- DECLARE
- CONCAT()
- CURDATE()
- DELIMITER

---

## Project Structure

```text
LibraryManagement/
│
├── LibraryManagement.sql
└── README.md
```

---

## Sample Data

### Books

| BookID | Title | Available Copies |
|--------|--------------------|-----------------|
|101|Java Programming|3|
|102|Database Systems|10|
|103|Python Basics|2|

### Members

| MemberID | Name | Membership |
|----------|------|------------|
|1|Shivam|Gold|
|2|Rahul|Silver|
|3|Priya|Gold|

### Librarians

| LibrarianID | Name | Experience | Salary |
|--------------|------|------------|---------|
|1|Amit|8|50000|
|2|Neha|3|35000|
|3|Kiran|10|60000|

---

## Sample Output

### RestockBooks()

```text
Books Restocked Successfully
```

### IncreaseSalary()

```text
Salary Updated Successfully
```

### IssueBook()

```text
Book Issued Successfully to Member 1
```

---

## How to Run

1. Open MySQL Workbench or any MySQL Online Compiler.
2. Execute the `LibraryManagement.sql` script.
3. The script will:
   - Create all tables
   - Insert sample data
   - Create stored procedures
   - Execute each stored procedure
   - Display the updated records

---

## Learning Outcomes

After completing this project, you will understand:

- Creating MySQL Stored Procedures
- Passing Parameters to Procedures
- Using Conditional Statements
- Managing Library Inventory
- Updating Records
- Working with SQL Date Functions
- Implementing Real-World Database Operations

---

## Technologies

- MySQL
- SQL
- Stored Procedures
- Conditional Logic
- Database Management

---

## Author

**Shivam Patil**