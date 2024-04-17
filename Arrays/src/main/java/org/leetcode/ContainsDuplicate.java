package org.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums){
        HashSet<Integer> numsSet = Arrays.stream(nums).boxed().collect(Collectors.toCollection(HashSet::new));

        return numsSet.size() != nums.length;
    }
}
