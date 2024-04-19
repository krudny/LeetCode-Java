package org.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numsDict = new HashMap<>();

        for(int num : nums) {
            numsDict.put(num, numsDict.getOrDefault(num, 0) + 1);
        }

        List<Integer> list = new ArrayList<>(numsDict.keySet());
        list.sort((a, b) -> numsDict.get(b) - numsDict.get(a));

        int[] res = new int[k];

        for(int i = 0; i < k; i++) {
            res[i] = list.get(i);
        }

        return res;
    }
}
