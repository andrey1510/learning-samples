package level8;//https://www.codewars.com/kata/57a5c31ce298a7e6b7000334/train/java

public class BinToDecimal {
    public static int binToDecimal(String inp){
        return Integer.parseInt(inp,2);
    }

    public static void main(String[] args) {                //test
        System.out.println(binToDecimal("0101"));
    }
}
