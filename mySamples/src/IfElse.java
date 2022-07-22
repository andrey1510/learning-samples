public class IfElse {

    public static void main(String[] args) {
    int i = 10;

    // IfElse sample
    if (i < 1) {
        System.out.println(i);
    } else if (i < 3) {
        System.out.println(i);
    } else if (i < 5) {
        System.out.println(i);
    } else {
        System.out.println(i);
    }
}


    // Ternary sample

    public boolean doSomething1(int i) {
        return (     (i % 2 == 0)  ?  true  :  false    );
        //              if        then     else
    }

    //  Ternary nested sample

    public int doSomething2(int i) {
        return (     (i % 2 == 0)  ?  111  :   ( i<2  ?  222  : 333 )    );
        //              if        then   else    ifN   thenN   elseN
    }


}
