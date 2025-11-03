public class BuilderPatternDemo {
    public static void main(String[] args) throws Exception {

        // Using the Builder to create a Computer object
        Computer computer = new Computer.ComputerBuilder()
                .setCPU("Intel i7")
                .setRAM("16GB")
                .setStorage("512GB SSD")
                .setGraphicsCard(true)
                .setBluetooth(true)
                .build();

        System.out.println(computer);
    }
}
