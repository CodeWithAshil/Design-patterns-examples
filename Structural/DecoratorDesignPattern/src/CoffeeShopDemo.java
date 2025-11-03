public class CoffeeShopDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome!");
        Coffe simpleCoffee = new SimpleCoffee();
        System.out.println(simpleCoffee.getDescription() + " $" + simpleCoffee.getCost());

        Coffe milkCoffee = new MilkDecorator(new SimpleCoffee());
        System.out.println(milkCoffee.getDescription() + " $" + milkCoffee.getCost());

        Coffe sugarMilkCoffee = new SugarDecorator(new MilkDecorator(new SimpleCoffee()));
        System.out.println(sugarMilkCoffee.getDescription() + " $" + sugarMilkCoffee.getCost());

        Coffe doubleSugarMilkCoffee = new SugarDecorator(new SugarDecorator(new MilkDecorator(new SimpleCoffee())));
        System.out.println(doubleSugarMilkCoffee.getDescription() + " $" + doubleSugarMilkCoffee.getCost());

        Coffe whippedCreamSugarMilkCoffee = new WhippedCreamDecorator(new SugarDecorator(new MilkDecorator(new SimpleCoffee()))); 
        System.out.println(whippedCreamSugarMilkCoffee.getDescription() + " $" + whippedCreamSugarMilkCoffee.getCost());


    }
}
