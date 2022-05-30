package SingletonPattern;

// The Singleton Pattern ensures a class has only one instance, and provides a global point of access to it.

public class SingletonEarly {  // Early Instantiation - creation of instance when the class is loaded.
                                 // Thread safe (may be used for multithreaded applications)

    private static SingletonEarly soleInstance = new SingletonEarly();  // declaring AND initializing static variable to hold single instance

    private SingletonEarly() {        // private constructor (so only this class may create an instance)
    }

    public static SingletonEarly getInstance() {   // providing global point of access (method)
        return soleInstance;                        // Thread safe (due to Early Instantiation)
    }

    // other required fields and methods may be set forth e.g.:
    public String info = "This is sample of Singleton with early instantiation";

}

class SingletonEarlyTest {
    public static void main(String[] args) {
        SingletonEarly singleton = SingletonEarly.getInstance(); // accessing method to get sole instance
        System.out.println(singleton.info);
    }
}
