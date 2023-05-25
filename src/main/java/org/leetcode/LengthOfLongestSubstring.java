package org.leetcode;

import java.util.LinkedHashSet;

public class LengthOfLongestSubstring {
    // https://leetcode.com/problems/longest-substring-without-repeating-characters/
    public static void main(String[] args) {
        String s = "abcdedgxcvbnm";
        LinkedHashSet<Character> linkedHashSet = new LinkedHashSet<>();
        int max = 0;
        int left = 0;
        for(int right = 0; right < s.length(); right++) {
            while(!linkedHashSet.add(s.charAt(right))) {
                linkedHashSet.remove(s.charAt(left++));
            }
            max = Math.max(max, (right - left) + 1);
        }

        System.out.println("Length of Longest Substring = " + max);
    }
}
