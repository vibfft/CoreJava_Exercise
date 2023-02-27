package com.vibfft;

import java.util.Scanner;

public class TwoNumberNeverNext2Exercise extends Exercise {

    ExType type;
    ExLevel level;

    TwoNumberNeverNext2Exercise() {
        type = ExType.SCANNER;
        level = ExLevel.MEDIUM;
    }

    String buildString(int[] arrayElements) {
        StringBuilder builder = new StringBuilder();
        for(int i: arrayElements) {
            builder.append(i);
        }
        return builder.toString();
    }

    Boolean containsNM( String elements, String nm, String mn) {
        System.out.println(elements + "," + elements.length());
        System.out.println(nm + "," + nm.length());
        System.out.println(mn + "," + mn.length());
        if (elements.contains(nm) || elements.contains(mn)) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arrayLength = s.nextInt(); // Read the array length

        int[] arrayElements = new int[arrayLength];
        for (int i = 0; i < arrayElements.length; i++) {
            arrayElements[i] = s.nextInt(); // Read each element of the array
        }

        int n = s.nextInt(); int m = s.nextInt(); // Read n and m integers

        String nm = Integer.toString(n) + Integer.toString(m);  // stringify nm
        String mn = Integer.toString(m) + Integer.toString(n);

        TwoNumberNeverNext2Exercise o = new TwoNumberNeverNext2Exercise();
        String elements = o.buildString(arrayElements);
        System.out.println(o.containsNM(elements, nm, mn));
    }
}
