//why use abstract class instead of interface here?
//Because we want to provide default implementation for some methods
//and also we want to hold a reference to the decorated object
//which is not possible with interface
public abstract class CoffeeDecorator implements Coffe {
    protected Coffe decoratedCoffee;

    public CoffeeDecorator(Coffe c) {
        this.decoratedCoffee = c;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost();
    }

}
