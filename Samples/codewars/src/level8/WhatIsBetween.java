package level8;
//https://www.codewars.com/kata/55ecd718f46fba02e5000029/train/java

import java.util.Arrays;

public class WhatIsBetween {

    public static int[] between(int a, int b) {
        int [] arr = new int[b-a+1];
        for (int i = 0; i<arr.length; i++) {
            arr[i] = i+a;
        }
        return arr;
    }

    public static void main(String[] args) {                    //test
        System.out.println(Arrays.toString(between(4, 22)));
    }
}
