package com.vibfft;

public class RootEqualsSumOfChildren extends Exercise {

    ExType type;
    ExLevel level;

    RootEqualsSumOfChildren() {
        type = ExType.SCANNER;
        level = ExLevel.EASY;
    }
}

class TreeNode extends RunningSumOfArray {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}
    TreeNode(int val) {
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public boolean checkTree(TreeNode root) {
        int node_value = root.val;
        int left_value = root.left.val;
        int right_value = root.right.val;

        return node_value == left_value + right_value;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10, new TreeNode(4), new TreeNode(6));
        Solution sol = new Solution();
        if (sol.checkTree(root)) {
            System.out.println("Root equals sum of children");
        } else {
            System.out.println("Root does not equal sum of children");
        }
    }
}
