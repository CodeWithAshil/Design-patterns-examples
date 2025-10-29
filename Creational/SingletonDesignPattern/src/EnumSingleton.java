public class EnumSingleton {
    // Enum Singleton Pattern
    // Provides implicit support for thread safety and serialization
    // Simple and effective way to implement singleton
    public enum Singleton {
        INSTANCE;

        public void someMethod() {
            System.out.println("Method called on Enum Singleton");
        }
    }
}
