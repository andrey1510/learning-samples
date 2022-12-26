public class Sequence {
    static int p1;
    static {
        p1=2;
        System.out.println("Static initializer block of parent class");
    }

    int p2;
    int p3;

    String s = "sssssssssssssssssss";


    {
        p2=5;
        System.out.println("Instance initializer block of parent class");
    }

    public Sequence() {
        System.out.println("Default constructor of parent class");
    }

    public Sequence(int p2) {
        this.p2 = p2;
        System.out.println("Parametrized constructor of parent class");
    }

    public Sequence(int p2, int p3) {
        this.p2 = p2;
        this.p3 = p3;
        System.out.println("Overloaded constructor of parent class");
    }

}


class SequenceChild extends Sequence {


    static int c1;
    static {
        c1=3;
        System.out.println("Static initializer block of child class");
    }

    int c2;
    {
        c2=2;
        System.out.println("Instance initializer block of child class");
    }


    public SequenceChild() {
        System.out.println("Default constructor of child class");
    }

    int c3;
    int c4;
    public SequenceChild(int c3) {
        this.c3 = c3;
        System.out.println("Parametrized constructor of child class");
    }

    public SequenceChild(int c3, int p2) {
        super(p2);
        this.c3 = c3;
        System.out.println("Chained constructor of child class");
    }


    public SequenceChild (String s) {


    }



}

class SequenceChildOfChild extends SequenceChild {

    static int cc1;
    static {
        cc1=3;
        System.out.println("Static initializer block of child of child class");
    }

    int cc2;
    {
        cc2=2;
        System.out.println("Instance initializer block of child of child class");
    }

    public SequenceChildOfChild() {
        System.out.println("Default constructor of child of child class");
    }

    int cc3;
    public SequenceChildOfChild(int cc3) {
        this.cc3 = cc3;
        System.out.println("Parametrized constructor of child of child class");
    }

    int cc4;
    public SequenceChildOfChild(int cc4, int c3) {
        super(c3);
        this.cc4 = cc4;
        System.out.println("Chained constructor of child of child class");
    }

}

class SequenceTest {
    public static void main(String[] args) {

//        Sequence t0 = new Sequence();
//        Sequence t01 = new Sequence(1);
//        Sequence t02 = new Sequence(1, 1);

      //  SequenceChild t1 = new SequenceChild();
      //  SequenceChild t2 = new SequenceChild(1);
      //  SequenceChild t3 = new SequenceChild(1, 1);

        SequenceChildOfChild t2 = new SequenceChildOfChild(1);
        SequenceChildOfChild t3 = new SequenceChildOfChild(1,2);

    }
}