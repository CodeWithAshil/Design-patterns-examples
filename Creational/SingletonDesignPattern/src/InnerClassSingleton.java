// Inner Class Singleton Pattern
// Utilizes a static inner helper class to hold the singleton instance
// Instance is created only when the inner class is loaded
// Thread-safe without requiring synchronization
// Lazy initialization
public class InnerClassSingleton {
    private InnerClassSingleton() {
    }

    private static class SingletonHelper {
        private static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
    }

    public static InnerClassSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
