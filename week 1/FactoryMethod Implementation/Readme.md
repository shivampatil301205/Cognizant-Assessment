# Factory Method Pattern Implementation

## Overview

This project demonstrates the Factory Method Design Pattern in Java. The pattern provides an interface for creating objects while allowing a factory class to decide which object to instantiate.

## Objective

To create different types of Vehicle objects without exposing the object creation logic to the client.

## File Structure

Factory Method Implementation/
│
├── FactoryMethod.java
└── README.md

## Classes Used

### Vehicle
An interface that defines the common method:

```java
void manufacture();
```

### Car
Implements the Vehicle interface and provides the implementation for manufacturing a car.

### Bike
Implements the Vehicle interface and provides the implementation for manufacturing a bike.

### VehicleFactory
Responsible for creating and returning the appropriate Vehicle object based on the input provided.

### FactoryMethod
Contains the main method and acts as the client.

## How It Works

1. The client creates an instance of VehicleFactory.
2. The factory receives the vehicle type as input.
3. The factory creates and returns the corresponding object.
4. The client uses the returned object without knowing its exact implementation.

## Compilation

```bash
javac FactoryMethod.java
```

## Execution

```bash
java FactoryMethod
```

## Expected Output

```text
Car is manufactured.
Bike is manufactured.
```

## Design Pattern

Factory Method Pattern

## Advantages

- Encapsulates object creation logic.
- Reduces coupling between client and implementation classes.
- Improves maintainability and scalability.
- Makes it easy to add new vehicle types in the future.

## Author

Shivam Patil
