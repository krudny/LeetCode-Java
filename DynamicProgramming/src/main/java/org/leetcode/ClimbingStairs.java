package org.leetcode;

public class ClimbingStairs {
    public int climbStairs(int n) {
        int a = 1;
        int b = 1;

        for(int i = 2; i <= n; i++) {
            int temp = b;
            b = a;
            a = b + temp;
        }

        return a;
    }
}
