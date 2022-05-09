package level8;

//https://www.codewars.com/kata/5a6663e9fd56cb5ab800008b/train/java

import java.util.Arrays;

public class CatDogYears {

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int catYears = 15;
        int dogYears = 15;
        if (humanYears == 2) {
            catYears = 24;
            dogYears = 24;
        } else if (humanYears > 2) {
            catYears = 24 + (humanYears-2)*4;
            dogYears = 24 + (humanYears-2)*5;
        }
        return new int [] {humanYears, catYears, dogYears};
    }

    public static void main(String[] args) {        //tests
        System.out.println(Arrays.toString(humanYearsCatYearsDogYears(1)));
        System.out.println(Arrays.toString(humanYearsCatYearsDogYears(2)));
        System.out.println(Arrays.toString(humanYearsCatYearsDogYears(4)));
        System.out.println(Arrays.toString(humanYearsCatYearsDogYears(5)));
    }
}
