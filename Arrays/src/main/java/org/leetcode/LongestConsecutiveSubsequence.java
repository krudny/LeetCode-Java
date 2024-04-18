package org.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

// For every number we check, if we have left neighbour on number line. If not, it's a beginning of sequence.
// Then we use while loop, to count how long the sequence is.

public class LongestConsecutiveSubsequence {


    public int longestConsecutive(int[] nums) {
        HashSet<Integer> numsSet = Arrays.stream(nums).boxed().collect(Collectors.toCollection(HashSet::new));
        int res = 1;

        for(int num : nums) {
            if (!numsSet.contains(num - 1)) {
                int i = 1;
                while(numsSet.contains(num + i)) {
                    i += 1;
                    res = Math.max(res, i);
                }
            }
        }

        return res;
    }
}
