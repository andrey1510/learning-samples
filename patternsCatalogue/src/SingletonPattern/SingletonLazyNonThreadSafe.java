package SingletonPattern;

// The Singleton Pattern ensures a class has only one instance, and provides a global point of access to it.

public class SingletonLazyNonThreadSafe {  // Lazy Instantiation - creation of instance when required.
                                            // Non thread safe - may not be used for multithreaded applications

    private static SingletonLazyNonThreadSafe soleInstance;  // declaring static variable to hold single instance

    private SingletonLazyNonThreadSafe() {        // private constructor (so only this class may create an instance)
    }

    public static SingletonLazyNonThreadSafe getInstance() {   // providing global point of access (method)
                                                               // Non thread safe
        if (soleInstance == null) {                            // if there exists an instance, another one will not be created
            soleInstance = new SingletonLazyNonThreadSafe();
        }
        return soleInstance;
    }

    // other required fields and methods may be set forth e.g.:
    public String info = "This is sample of Singleton with non thread safe lazy instantiation";

}

class SingletonPatternLazyNonThreadSafeTest {
    public static void main(String[] args) {
        SingletonLazyNonThreadSafe singleton = SingletonLazyNonThreadSafe.getInstance(); // accessing method to get sole instance
        System.out.println(singleton.info);
    }
}
