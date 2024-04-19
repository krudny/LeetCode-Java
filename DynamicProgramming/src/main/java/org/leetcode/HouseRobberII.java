package org.leetcode;
public class HouseRobberII {

    private int rob_range(int[] nums, int left, int right) {
        if (left == right) {
            return nums[left];
        }
        int[] rob = new int[right - left + 1];
        rob[0] = nums[left];
        rob[1] = Math.max(nums[left], nums[left + 1]);


        for (int i = 2; i < rob.length; i++) {
            rob[i] = Math.max(rob[i - 2] + nums[left + i], rob[i - 1]);
        }

        return rob[rob.length - 1];
    }

    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }
        if (n == 2) {
            return Math.max(nums[0], nums[1]);
        }
        return Math.max(rob_range(nums, 0, n - 2), rob_range(nums, 1, n - 1));
    }
}
