public class Sequence {
    static int p1;
    static {
        p1=2;
        System.out.println("Static initializer block of parent class");
    }

    int p2;
    {
        p2=5;
        System.out.println("Instance initializer block of parent class");
    }

    public Sequence() {
        System.out.println("Default constructor of parent class");
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
    public SequenceChild(int c3) {
        this.c3 = c3;
        System.out.println("Parametrized constructor of child class");
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
    //SequenceChild t1 = new SequenceChild(1);
    //SequenceChildOfChild t2 = new SequenceChildOfChild(1);
        SequenceChildOfChild t3 = new SequenceChildOfChild(1,2);

    }
}