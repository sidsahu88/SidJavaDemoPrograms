package com.demo.collections;

import java.util.HashMap;
import java.util.Stack;


public class ParenthesesBalanceUsingStack {
    private static boolean isParenthesesBalanced(String parenthesesStr) {
        Stack<Character> stack = new Stack<>();

        HashMap<Character, Character> closingParentMap = new HashMap<>();
        closingParentMap.put(')', '(');
        closingParentMap.put('}', '{');
        closingParentMap.put(']', '[');

        for (char bracket : parenthesesStr.toCharArray()) {
            if (!closingParentMap.containsKey(bracket))
                stack.push(bracket);
            else {
                if (stack.empty() || stack.pop() != closingParentMap.get(bracket))
                    return false;
            }
        }

        return stack.empty();
    }

    public static void main(String[] args) {
        System.out.println("1 - " + isParenthesesBalanced("{}{()}[{()}]"));
        System.out.println("2 - " + isParenthesesBalanced("{}{()}[}{()}]"));
        System.out.println("3 - " + isParenthesesBalanced("([]()"));
        System.out.println("4 - " + isParenthesesBalanced(")()[]{}"));
        System.out.println("5 - " + isParenthesesBalanced("([)]"));
        System.out.println("6 - " + isParenthesesBalanced("[{})"));
    }
}
