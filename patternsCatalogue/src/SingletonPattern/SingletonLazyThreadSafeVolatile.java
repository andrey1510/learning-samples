package SingletonPattern;

// The Singleton Pattern ensures a class has only one instance, and provides a global point of access to it.

public class SingletonLazyThreadSafeVolatile {  // Lazy Instantiation - creation of instance when required.
                                        // Thread safe (may be used for multithreaded applications)
                                    // This Thread safe ensuring (synchronized) is very slow
    private static volatile SingletonLazyThreadSafeVolatile soleInstance;  // declaring static variable to hold single instance

    private SingletonLazyThreadSafeVolatile() {        // private constructor (so only this class may create an instance)
    }

    public static SingletonLazyThreadSafeVolatile getInstance() {   // providing global point of access (method)
                                                            // Thread safe (as volatile)  - double-checked locking
        if (soleInstance == null) {                            // if there exists an instance, another one will mot be created
            synchronized (SingletonLazyThreadSafeVolatile.class) {
                if (soleInstance == null) {
                    soleInstance = new SingletonLazyThreadSafeVolatile();
                }
            }
        }
        return soleInstance;
    }

    // other required fields and methods may be set forth e.g.:
    private String info = "This is sample of Singleton with thread safe lazy instantiation (volatile). Double-checked locking was used.";
    public String getInfo() {
        return info;
    }

}

class SingletonLazyThreadSafeVolatileTest {
    public static void main(String[] args) {
        SingletonLazyThreadSafeVolatile singleton = SingletonLazyThreadSafeVolatile.getInstance(); // accessing method to get sole instance
        System.out.println(singleton.getInfo());
    }
}
