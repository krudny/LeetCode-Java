package org.leetcode;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> strsMap = new HashMap<>();

        for (String str : strs) {
            char[] letters = str.toCharArray();
            Arrays.sort(letters);
            String sortedStr = new String(letters);

            if (strsMap.containsKey(sortedStr)) {
                strsMap.get(sortedStr).add(str);
            } else {
                strsMap.put(sortedStr, new ArrayList<String>());
                strsMap.get(sortedStr).add(str);
            }

        }

        return new ArrayList<>(strsMap.values());
    }
}
