package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(bubbleSort(new int[]{1, 6, 6, 40, 2,4,2,3,6,18,81,388,182838})));

    }
    public static int[] bubbleSort(int[] a){
        for (int j = 0; j < a.length -1; j++) {
            for (int i = 0; i < a.length-1-j; i++) {
                if (a[i] > a[ i +1]) {
                    int help = a[i];
                    a[i] = a[i+1];
                    a[i+1] = help;
                }
            }
        }

       return a;
    }
}
