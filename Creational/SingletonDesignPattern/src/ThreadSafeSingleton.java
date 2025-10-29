// Thread-Safe Singleton with Synchronized Method
// Ensures that only one thread can access the getInstance method at a time
// Simple to implement but may have performance drawbacks due to synchronization overhead
// Suitable for scenarios where singleton instance creation is infrequent
// and the performance impact of synchronization is negligible
// Thread-safe
// Lazy initialization
// Simple implementation
public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}
