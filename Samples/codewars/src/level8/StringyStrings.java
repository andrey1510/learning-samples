package level8;
//https://www.codewars.com/kata/563b74ddd19a3ad462000054/train/java

public class StringyStrings {

    public static String stringy(int size) {
        StringBuilder str = new StringBuilder(size);
        for (int i = 0; i<size; i++) {
            str.append( (i % 2 == 0) ? '1' : '0');
        }
        return String.valueOf(str);
    }

        public static void main(String[] args) {            // test
        System.out.println(stringy(23));
    }

}
