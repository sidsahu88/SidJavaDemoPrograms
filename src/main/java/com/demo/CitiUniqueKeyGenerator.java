package com.demo;

import lombok.extern.slf4j.Slf4j;

import java.security.SecureRandom;

@Slf4j
public class CitiUniqueKeyGenerator {

    static String getUniqueAlphaString(String charsString, int n) {
        StringBuilder uniqueKey = new StringBuilder(n);
        SecureRandom secureRandom = new SecureRandom();

        for (int i = 0; i < n; i++) {
            //int uniqueIndex = (int) (charsString.length() * Math.random());
            int uniqueIndex = secureRandom.nextInt(charsString.length());
            uniqueKey.append(charsString.charAt(uniqueIndex));
        }

        return uniqueKey.toString();
    }

    public static void main(String[] args) {
        String charsString = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        log.info(getUniqueAlphaString(charsString, 12));
    }
}
