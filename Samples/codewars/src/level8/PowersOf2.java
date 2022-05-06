package level8;//https://www.codewars.com/kata/57a083a57cb1f31db7000028/train/java

import java.util.Arrays;

public class PowersOf2 {
    public static long[] powersOfTwo(int n){

        if (n>0) {
            long [] list  = new long[n+1];
            long m = 2;
            for (int i = 0; i < list.length; i++) {

                if (i == 0) {
                    list[i] = (long) 1;
                }
                else {
                    list[i] = (long) m;
                    m=m*2;
                }
            }
            return list;
        }
        else {
            long [] list  = new long[1];
            list[0] = 1;
            return list;
        }
    }



    public static void main(String[] args) {
        System.out.println(Arrays.toString(powersOfTwo(37)));
    }

}
