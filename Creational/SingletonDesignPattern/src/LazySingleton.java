// Lazy Initialization Singleton Pattern
// Instance is created only when it is requested for the first time
// Not thread-safe, suitable for single-threaded environments
public class LazySingleton {
    public static LazySingleton instance;//

    private LazySingleton() {
        System.out.println("LazySingleton Instance Created");
    }

    public static LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
