package com.demo;

public class CitiFindFirstNonRepeatedCharInString {
    public static void main(String[] args) {
        String[] testCases = {"ababdcab", "", null, "abcbcbd", "ababdcabcd"};

        for (String test : testCases) {
            int testResult = getIndexFirstNonRepeatChar(test);
            System.out.println(testResult + " " + (testResult == -1 ? "Not found " :test.charAt(testResult)));
        }
    }

    private static int getIndexFirstNonRepeatChar(String str) {
        if (str == null || str.isBlank())
            return -1;

        int[] charCount = new int[26];

        for (char ch : str.toCharArray()) {
            charCount[ch - 'a']++;
        }

        for (int i=0; i < str.length(); i++) {
            int indx = str.charAt(i) - 'a';
            if (charCount[indx] == 1)
                return i;
        }

//        for (char ch:str.toCharArray()) {
//            if (charCount[ch - 'a'] == 1)
//                return str.indexOf(ch);
//        }

        return -1;
    }
}
