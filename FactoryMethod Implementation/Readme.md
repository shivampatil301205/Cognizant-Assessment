# Factory Method Pattern Implementation

## Objective
To demonstrate the Factory Method Design Pattern in Java.

## Description
The Factory Method Pattern provides a way to create objects without exposing the object creation logic to the client.

In this implementation:

- Vehicle is the interface.
- Car and Bike are concrete implementations of Vehicle.
- VehicleFactory creates the required Vehicle object.
- FactoryMethod contains the main method to test the pattern.

## File Structure

Factory Method Implementation/
│
├── FactoryMethod.java
└── README.md

## Code Explanation

### Vehicle Interface
Defines the common method:

```java
void manufacture();