public class Computer {

    private String CPU;
    private String RAM;
    private String storage;
    private boolean graphicsCard;
    private boolean bluetooth;

    // Private constructor (only Builder can call)
    private Computer(ComputerBuilder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.bluetooth = builder.bluetooth;
    }

    public String getCPU() {
        return CPU;
    }
    public String getRAM() {
        return RAM;
    }
    public String getStorage() {
        return storage; 
    }
    public boolean hasGraphicsCard() {
        return graphicsCard;
    }
    public boolean hasBluetooth() {
        return bluetooth;
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", storage=" + storage +
                ", graphicsCard=" + graphicsCard + ", bluetooth=" + bluetooth + "]";
    }


    // Static Inner Builder Class
    public static class ComputerBuilder {
        private String CPU;
        private String RAM;
        private String storage;
        private boolean graphicsCard;
        private boolean bluetooth;

        public ComputerBuilder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }
        
        public ComputerBuilder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public ComputerBuilder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public ComputerBuilder setGraphicsCard(boolean graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public ComputerBuilder setBluetooth(boolean bluetooth) {
            this.bluetooth = bluetooth;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

}
