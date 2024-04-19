package org.leetcode;

public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        int n = s.length();

        int max_left = 0;
        int max_right = 0;
        int max_length = 0;

        for(int i = 0; i < n; i++) {
            // odd length

            int left = i;
            int right = i;
            int curr_len = 1;

            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                if (curr_len > max_length) {
                    max_length = curr_len;
                    max_left = left;
                    max_right = right;
                }
                left -= 1;
                right += 1;
                curr_len += 2;
            }

            // even length

            left = i;
            right = i + 1;
            curr_len = 2;

            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                if (curr_len > max_length) {
                    max_length = curr_len;
                    max_left = left;
                    max_right = right;
                }
                left -= 1;
                right += 1;
                curr_len += 2;
            }
        }

        return s.substring(max_left, max_right + 1);
    }
}
