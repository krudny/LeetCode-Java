package org.leetcode;

import java.util.HashMap;

public class DecodeWays {

    private final HashMap<Integer, Integer> dp = new HashMap<>();
    private int calcWays(String s, int i) {
        if(dp.containsKey(i)) { return dp.get(i); }
        else if(i == s.length()) { return 1; }
        else if (i > s.length()) { return 0; }
        else if (s.charAt(i) == '0') { return 0; }

        dp.put(i, 0);

        if (i < s.length() - 1 && (s.charAt(i) == '1' || (s.charAt(i) == '2' && "0123456".indexOf(s.charAt(i + 1)) != -1))) {
            dp.put(i, dp.get(i) + calcWays(s, i + 1) + calcWays(s, i + 2));
        }
        else {
            dp.put(i, dp.get(i) + calcWays(s, i + 1));
        }

        return dp.get(i);
    }

    public int decodeWays(String s) {
        return calcWays(s, 0);
    }
}
