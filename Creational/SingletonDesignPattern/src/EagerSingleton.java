/* Eager Initialization Singleton */
// Instance is created at the time of class loading
// Simple and thread-safe without requiring synchronization
// May lead to resource wastage if the instance is never used
public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton(); // Instance is created immediately when the class is loaded

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
