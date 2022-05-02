package chapter5;

// TiJ Ch.5, Tasks 8,9

public class Constr {
    void test1() {

        System.out.println("Test1");
    };
    void test2() {
        test1();
        this.test1();
    };

   // int i;
    public Constr(int i) {
        //this.i=i;
        i=1;
    }


    //public Constr(int i, char c) {
        //this.i=i;
    //}

    public static void main(String[] args) {
        Constr cnst = new Constr(1);
        cnst.test1();
        cnst.test2();
        System.out.println(cnst);


    }

}
