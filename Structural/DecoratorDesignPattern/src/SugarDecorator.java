public class SugarDecorator extends CoffeeDecorator {
    
    public SugarDecorator(Coffe c) {
        super(c);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Sugar";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 0.5;
    }

}
