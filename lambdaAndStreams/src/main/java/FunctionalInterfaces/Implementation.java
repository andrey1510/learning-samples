package FunctionalInterfaces;

public class Implementation {
    public static void main(String[] args) {
        FuncInterface reference;
        reference = (i,n) -> i*n+3;
        System.out.println(reference.doSomething(4,6));
    }
}

