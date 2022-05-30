package SingletonPattern;

// The Singleton Pattern ensures a class has only one instance, and provides a global point of access to it.

public class SingletonLazyThreadSafe {  // Lazy Instantiation - creation of instance when required.
                                        // Thread safe (may be used for multithreaded applications)
    private static SingletonLazyThreadSafe soleInstance;  // declaring static variable to hold single instance

    private SingletonLazyThreadSafe() {        // private constructor (so only this class may create an instance)
    }

    public static synchronized SingletonLazyThreadSafe getInstance() {   // providing global point of access (method)
                                                            // Thread safe (as synchronized); volatile keyword also may be used
        if (soleInstance == null) {                            // if there exists an instance, another one will mot be created
            soleInstance = new SingletonLazyThreadSafe();
        }
        return soleInstance;
    }

    // other required fields and methods may be set forth e.g.:
    public String info = "This is sample of Singleton with thread safe lazy instantiation";
}

class SingletonLazyThreadSafeTest {
    public static void main(String[] args) {
        SingletonLazyThreadSafe singleton = SingletonLazyThreadSafe.getInstance(); // accessing method to get sole instance
        System.out.println(singleton.info);
    }
}
