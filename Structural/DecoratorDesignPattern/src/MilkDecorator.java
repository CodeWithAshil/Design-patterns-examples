public class MilkDecorator extends CoffeeDecorator {
    
    public MilkDecorator(Coffe c) {
        super(c);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 1.5;
    }

}
