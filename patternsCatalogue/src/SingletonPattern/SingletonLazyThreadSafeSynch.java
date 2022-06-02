package SingletonPattern;

// The Singleton Pattern ensures a class has only one instance, and provides a global point of access to it.

public class SingletonLazyThreadSafeSynch {  // Lazy Instantiation - creation of instance when required.
                                        // Thread safe (may be used for multithreaded applications)
                                    // This Thread safe ensuring (synchronized) is very slow
    private static SingletonLazyThreadSafeSynch soleInstance;  // declaring static variable to hold single instance

    private SingletonLazyThreadSafeSynch() {        // private constructor (so only this class may create an instance)
    }

    public static synchronized SingletonLazyThreadSafeSynch getInstance() {   // providing global point of access (method)
                                                            // Thread safe (as synchronized)
        if (soleInstance == null) {                            // if there exists an instance, another one will mot be created
            soleInstance = new SingletonLazyThreadSafeSynch();
        }
        return soleInstance;
    }

    // other required fields and methods may be set forth e.g.:
    private String info = "This is sample of Singleton with thread safe lazy instantiation (synchronized). It is slow.";
    public String getInfo() {
        return info;
    }

}

class SingletonLazyThreadSafeSynchTest {
    public static void main(String[] args) {
        SingletonLazyThreadSafeSynch singleton = SingletonLazyThreadSafeSynch.getInstance(); // accessing method to get sole instance
        System.out.println(singleton.getInfo());
    }
}
