public class WhipCreamDecorator extends CoffeeDecorator {
    
    public WhipCreamDecorator(Coffe c) {
        super(c);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Whip Cream";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 2.0;
    }

}
