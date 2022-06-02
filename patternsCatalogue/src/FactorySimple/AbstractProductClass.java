package FactorySimple;

public abstract class AbstractProductClass {     // Abstract product class
                                                // It contains methods to manipulate products and fields to be implemented by concrete product classes
        // Fields to be implemented by concrete product classes
    String name;
    String details;

        // Methods to manipulate with products
    public void inform() {
        System.out.println(name + " was ordered.");
    }
    public void assemble() {
        System.out.printf("%s was assembled from %s.%n", name, details);
    }
    public void deliver() {
        System.out.printf("%s was delivered.%n", name);
        System.out.println("");
    }

}
