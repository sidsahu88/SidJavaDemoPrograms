package com.demo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IGTStringSort {

    public static void main(String[] args) {

        String input = "bbccdefbbaa";

        log.info("Input String: {}", input);

        int[] count = new int[26];

        for (char ch : input.toCharArray()) {
            count[ch - 'a']++;
        }

        StringBuilder output = new StringBuilder();

        for (int j = 0; j < count.length; j++) {
            char ch = (char) (j + 'a');

            while (count[j] > 0) {
                output.append(ch);
                count[j]--;
            }
        }

        log.info("Sorted String: {}", output);
    }
}
