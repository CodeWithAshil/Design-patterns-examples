# Adapter Design Pattern

The Adapter Design Pattern is a structural design pattern that allows objects with incompatible interfaces to work together. It acts as a bridge between two incompatible interfaces by converting the interface of a class into another interface that a client expects. This pattern is particularly useful when integrating new components into existing systems without modifying their code.

## Key Components

- **Target**: The interface that the client expects.
- **Adapter**: The class that implements the Target interface and translates requests to the Adaptee.
- **Adaptee**: The existing interface that needs adapting.

## Use Cases

- When you want to use an existing class but its interface does not match the one you need.
- When you want to create a reusable class that cooperates with classes that don't have compatible interfaces.

## Example

```java
// Target interface
interface Target {
    void request();
}

// Adaptee class
class Adaptee {
    void specificRequest() {
        System.out.println("Specific request.");
    }
}

// Adapter class
class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}

// Client code
public class Client {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.request(); // Outputs: Specific request.
    }
}
```

## Conclusion

The Adapter Design Pattern promotes flexibility and reusability by allowing incompatible interfaces to work together seamlessly.  