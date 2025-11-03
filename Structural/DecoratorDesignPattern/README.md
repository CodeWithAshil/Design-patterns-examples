# Decorator Design Pattern

The Decorator Design Pattern is a structural pattern that allows adding new behaviors to objects dynamically by placing these objects inside wrapper objects that contain the behaviors.

## Intent
- Attach additional responsibilities to an object dynamically
- Provide a flexible alternative to subclassing for extending functionality
- Follow Single Responsibility Principle and Open/Closed Principle

## Structure
- **Component**: Defines the interface for objects that can have responsibilities added
- **ConcreteComponent**: Defines an object to which additional responsibilities can be attached
- **Decorator**: Maintains a reference to a Component object and defines an interface conforming to Component's interface
- **ConcreteDecorator**: Adds responsibilities to the component

## Use When
- You need to add responsibilities to objects dynamically and transparently
- You want to extend functionality through composition instead of inheritance
- You have several independent ways to extend functionality

## Real-World Examples
- Adding toppings to a pizza
- Adding features to a car
- Adding filters to an image processing pipeline

## Benefits
- More flexibility than static inheritance
- Avoids feature-laden classes high up in the hierarchy
- Supports Single Responsibility Principle
- Allows responsibilities to be added or removed at runtime

## Drawbacks
- Can result in many small objects
- Can be complex for developers to understand
- Order of decorators can be important