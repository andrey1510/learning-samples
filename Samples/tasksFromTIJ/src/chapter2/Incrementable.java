package chapter2;

// TiJ Ch.2, Tasks 7 and 8

public class Incrementable {
    static void increment () {
        StaticTest.i++;
    }
    public Incrementable() {
    }

    void print (){System.out.println(StaticTest.i);}

    public static void main(String[] args) {
        Incrementable sf1 = new Incrementable();
        Incrementable sf2 = new Incrementable();
        sf1.print();
        sf2.print();
        Incrementable.increment();
        sf1.print();
        sf2.print();

    }

}
