package com.test;

/**
 * Shifts the array by "t" value
 */
public class ComplexCode {

    private void someAlgorithm(int a[], int t) {
        int x;
        for (int j = 0; j < t; j++) {
            x = a[0];
            for (int i = 0; i < a.length - 1; i++) {
                a[i] = a[i + 1];
            }
            a[a.length - 1] = x;
        }

        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                System.out.println(a[i]);
            } else {
                System.out.print(a[i] + ", ");
            }
        }

    }
    
    public static void main(String[] args) {
        ComplexCode cc = new ComplexCode();
        int[] intArray = new int[]{7, 1, 9, 6, 10, 5, 8, 2, 3, 4};

        cc.someAlgorithm(intArray, 5);

        Boolean test = true;

        boolean t = test.booleanValue();
        System.out.println(t);


    }
}
