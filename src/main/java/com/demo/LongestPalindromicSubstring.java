package com.demo;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        System.out.println("adbscerkrecljdsaasdj : " + findLongPalindromicSubstring("adbscerkrecljdsaasdj"));
        System.out.println("cljdsdjcl : " + findLongPalindromicSubstring("cljdsdjcl"));
        System.out.println(":" + findLongPalindromicSubstring(" "));
        System.out.println(null + ":" + findLongPalindromicSubstring(null));
        System.out.println("a:" + findLongPalindromicSubstring("a"));
        System.out.println("ab:" + findLongPalindromicSubstring("a"));
        System.out.println("abcc:" + findLongPalindromicSubstring("cc"));
    }

    private static String findLongPalindromicSubstring(String str) {
        if (str == null || str.isBlank())
            return "";

        int n = str.length();

        if (n == 1)
            return str;

        int[][] palTab = new int[n][n]; // Create a 2-d array to store the values
        int max = 0;
        int strtIndx = 0, lastIndx = 1;

        for (int i = 0; i < n; i++) { // Loop through string
            for (int j = n - 1; j >= 0; j--) { // Loop backward through string
                int k = n - 1 - j;

                if (str.charAt(i) == str.charAt(j)) {
                    if ((i == 0) || (k == 0))
                        palTab[i][k] = 1;
                    else
                        palTab[i][k] = palTab[i - 1][k - 1] + 1;
                }

                if (max < palTab[i][k]) {
                    max = palTab[i][k];
                    lastIndx = i + 1;
                    strtIndx = lastIndx - max;
                }
            }
        }

        return str.substring(strtIndx, lastIndx);
    }
}