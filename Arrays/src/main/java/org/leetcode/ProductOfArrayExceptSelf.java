package org.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] res = new int[n];
        int[] prefix = new int[n];
        int[] postfix = new int[n];

        prefix[0] = nums[0];
        postfix[n-1] = nums[n-1];

        for(int i = 1; i < n; i++) {
            prefix[i] = prefix[i-1] * nums[i];
        }

        for(int i = n - 2; i >= 0; i--) {
            postfix[i] = postfix[i+1] * nums[i];
        }

        res[0] = postfix[1];
        res[n-1] = prefix[n-2];

        for(int i = 1; i < n-1; i++) {
            res[i] = prefix[i-1] * postfix[i+1];
        }

        return res;
    }
}
