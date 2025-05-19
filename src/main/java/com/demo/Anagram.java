package com.demo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Anagram {

    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listen";

        log.info("Are the Strings {} and {} anagram? - {}", s1, s2, isAnagram(s1, s2));

    }

    private static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        int[] count = new int[26];

        for (int n = 0; n < s1.length(); n++) {
            count[s1.charAt(n) - 'a']++;
            count[s2.charAt(n) - 'a']--;
        }

        for (int i : count)
            if (count[i] != 0)
                return false;

        return true;
    }

}
