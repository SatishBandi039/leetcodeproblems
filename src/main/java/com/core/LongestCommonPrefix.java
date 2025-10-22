package com.core;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int i = 0;
        int minLen = Math.min(first.length(), last.length());
        while (i < minLen && first.charAt(i) == last.charAt(i)) {
            i++;
        }
        return first.substring(0, i);
    }
    public static void main(String[] args) {
        String[] arr = { "geeksforgeeks", "geeks", "geek", "geezer" };
        System.out.println(longestCommonPrefix(arr)); // Output: "gee"
    }
}
