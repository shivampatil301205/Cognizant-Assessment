# Financial Forecasting

## Exercise 7 - Algorithms & Data Structures

### Objective
This project implements and analyzes recursive, memoized, and iterative algorithms for predicting future financial values based on a constant annual growth rate. It demonstrates different algorithmic approaches while comparing their efficiency and implementation.

---

## Features

- Recursive financial forecasting
- Memoized forecasting using HashMap
- Iterative forecasting using loops
- Comparison of three algorithmic approaches
- Simple and efficient Java implementation

---

## Problem Statement

Given:
- Initial Investment Amount
- Annual Growth Rate
- Number of Years

Predict the future value of the investment using:

Future Value = Present Value × (1 + Growth Rate)^Years

---

## Algorithms Implemented

### Recursive Approach
Uses recursion to calculate the investment value for each year until the desired forecast period is reached.

### Memoization Approach
Optimizes recursion by storing previously computed values in a HashMap, avoiding repeated calculations.

### Iterative Approach
Uses a loop to calculate the future investment value efficiently without recursion.

---

## Technologies Used

- Java
- HashMap
- Recursion
- Dynamic Programming (Memoization)
- Iteration

---

## Project Structure

```
FinancialForecasting/
│
├── FinancialForecasting.java
└── README.md
```

---

## Sample Input

```
Initial Investment : 10000
Annual Growth Rate : 10%
Forecast Years     : 5
```

---

## Sample Output

```
Recursive Forecast: 16105.10
Memoized Forecast: 16105.10
Iterative Forecast: 16105.10
```

---

## Time Complexity

| Algorithm | Time Complexity | Space Complexity |
|-----------|-----------------|------------------|
| Recursive | O(n) | O(n) |
| Memoized | O(n) | O(n) |
| Iterative | O(n) | O(1) |

---

## Learning Outcomes

- Understand recursive algorithms.
- Learn memoization using HashMap.
- Compare recursive and iterative solutions.
- Analyze algorithm time and space complexity.
- Apply algorithmic concepts to financial forecasting.

---

## Author

**Name:** Shivam Patil

