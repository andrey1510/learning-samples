package SingletonPattern;

// The Singleton Pattern ensures a class has only one instance, and provides a global point of access to it.

public class SingletonEager {  // Eager Instantiation - creation of instance when the class is loaded.
                                 // Thread safe (may be used for multithreaded applications)

    private static SingletonEager soleInstance = new SingletonEager();  // declaring AND initializing static variable to hold single instance

    private SingletonEager() {        // private constructor (so only this class may create an instance)
    }

    public static SingletonEager getInstance() {   // providing global point of access (method)
        return soleInstance;                        // Thread safe (due to Eager Instantiation)
    }

    // other required fields and methods may be set forth e.g.:
    private String info = "This is sample of Singleton with early instantiation";
    public String getInfo() {
        return info;
    }

}

class SingletonEagerTest {
    public static void main(String[] args) {
        SingletonEager singleton = SingletonEager.getInstance(); // accessing method to get sole instance
        System.out.println(singleton.getInfo());
    }
}
