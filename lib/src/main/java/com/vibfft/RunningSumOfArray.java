package com.vibfft;

public class RunningSumOfArray extends Exercise {

    ExType type;
    ExLevel level;

    RunningSumOfArray() {
        type = ExType.SCANNER;
        level = ExLevel.EASY;
    }
}

class SolutionTwo extends RunningSumOfArray {

    public int[] runningSum(int[] nums) {
        int[] sum_array = new int[nums.length];

        if (nums.length == 0) {
            System.out.println("Number array is empty");
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (i == 0) {
                    sum_array[i] = nums[i];
                } else {
                    sum_array[i] = nums[i] + sum_array[i - 1];
                }
            }
        }
        return sum_array;
    }

    public static void main(String[] args) {
        SolutionTwo sol = new SolutionTwo();
        int[] nums = new int[]{3, 1, 2, 10, 1};

        for (int num : sol.runningSum(nums)) {
            System.out.print(num + ", ");
        }
        System.out.println();
    }
}
