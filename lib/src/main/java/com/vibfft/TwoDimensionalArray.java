package com.vibfft;

import java.util.Arrays;

public class TwoDimensionalArray extends Exercise {

    ExType type;
    ExLevel level;

    TwoDimensionalArray() {
        type = ExType.SCANNER;
        level = ExLevel.EASY;
    }
}

class SolutionThree extends TwoDimensionalArray {

    int maximumWealth(int[][] accounts) {
        int[] newArray = new int[accounts.length];
        for(int i = 0; i < accounts.length; i++) {
            int maxSum = 0;
            for(int j = 0; j < accounts[i].length; j++) {
                maxSum += accounts[i][j];
            }
            newArray[i] = maxSum;
        }
        return Arrays.stream(newArray).max().getAsInt();
    }

    public static void main(String[] args) {
        SolutionThree s = new SolutionThree();

        int[][] accounts = {{2,8,7},{7,1,3},{1,9,5}};
        System.out.println(s.maximumWealth(accounts));
    }
}
