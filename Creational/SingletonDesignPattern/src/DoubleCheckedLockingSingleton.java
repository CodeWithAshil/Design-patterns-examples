public class DoubleCheckedLockingSingleton {

    /*
        - Volatile variable to ensure visibility of changes across threads
        - and prevent instruction reordering
        - This is crucial for the double-checked locking pattern to work correctly
        - It ensures that once the instance is assigned, any thread reading the instance
        - will see the fully constructed object
        - This is a common pattern in Java to ensure thread-safe lazy initialization of singletons
        - Lazy
        - Thread-safe
        - High performance
        - Modern Java best practice
*/
    private static volatile DoubleCheckedLockingSingleton instance;

    private DoubleCheckedLockingSingleton() {
    }

    public static DoubleCheckedLockingSingleton getInstance() {
        if (instance == null) {// First check (no locking)
            synchronized (DoubleCheckedLockingSingleton.class) {// Locking on the class object itself 
                if (instance == null) {
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }
}
