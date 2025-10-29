public class App {
    public static void main(String[] args) throws Exception {
        // Eager Singleton
        EagerSingleton eagerInstance1 = EagerSingleton.getInstance();// Already created at class loading
        EagerSingleton eagerInstance2 = EagerSingleton.getInstance();// Returns existing instance
        System.out.println("Eager Singleton:");
        System.out.println("Instance 1: " + eagerInstance1);
        System.out.println("Instance 2: " + eagerInstance2);

        // Lazy Singleton
        LazySingleton lazyInstance1 = LazySingleton.getInstance();// Creates instance
        LazySingleton lazyInstance2 = LazySingleton.getInstance();// Returns existing instance
        System.out.println("Lazy Singleton:");
        System.out.println("Instance 1: " + lazyInstance1);
        System.out.println("Instance 2: " + lazyInstance2);
        System.out.println(lazyInstance1 == lazyInstance2 ? "Same instance" : "Different instances");

        // Double-Checked Locking Singleton
        DoubleCheckedLockingSingleton dclInstance1 = DoubleCheckedLockingSingleton.getInstance();
        DoubleCheckedLockingSingleton dclInstance2 = DoubleCheckedLockingSingleton.getInstance();
        System.out.println("Double-Checked Locking Singleton:");
        System.out.println("Instance 1: " + dclInstance1);
        System.out.println("Instance 2: " + dclInstance2);

        // Inner Class Singleton
        InnerClassSingleton innerClassInstance1 = InnerClassSingleton.getInstance();
        InnerClassSingleton innerClassInstance2 = InnerClassSingleton.getInstance();
        System.out.println("Inner Class Singleton:");
        System.out.println("Instance 1: " + innerClassInstance1);
        System.out.println("Instance 2: " + innerClassInstance2);
        System.out.println(innerClassInstance1 == innerClassInstance2 ? "Same instance" : "Different instances");

        // Enum Singleton
        EnumSingleton.Singleton enumInstance1 = EnumSingleton.Singleton.INSTANCE;
        EnumSingleton.Singleton enumInstance2 = EnumSingleton.Singleton.INSTANCE;
        System.out.println("Enum Singleton:");
        System.out.println("Instance 1: " + enumInstance1);
        System.out.println("Instance 2: " + enumInstance2);
        System.out.println(enumInstance1 == enumInstance2 ? "Same instance" : "Different instances");
    }
}
