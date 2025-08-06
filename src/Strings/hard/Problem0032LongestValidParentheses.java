package Strings.hard;

import java.util.Stack;

public class Problem0032LongestValidParentheses {

    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();

                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    maxLen = Math.max(maxLen, i - stack.peek());
                }
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        Problem0032LongestValidParentheses solution = new Problem0032LongestValidParentheses();

        String test1 = "(()";
        int result1 = solution.longestValidParentheses(test1);
        System.out.println("Test 1 (LeetCode): s=\"" + test1 + "\" → " + result1);

        String test2 = ")()())";
        int result2 = solution.longestValidParentheses(test2);
        System.out.println("Test 2 (LeetCode): s=\"" + test2 + "\" → " + result2);

        String test3 = "";
        int result3 = solution.longestValidParentheses(test3);
        System.out.println("Test 3 (LeetCode): s=\"" + test3 + "\" → " + result3);

        String test4 = "((()))";
        int result4 = solution.longestValidParentheses(test4);
        System.out.println("Test 4 (Custom): s=\"" + test4 + "\" → " + result4);

        String test5 = "()(()(())";
        int result5 = solution.longestValidParentheses(test5);
        System.out.println("Test 5 (Custom): s=\"" + test5 + "\" → " + result5);

        String test6 = ")))((((";
        int result6 = solution.longestValidParentheses(test6);
        System.out.println("Test 6 (Custom): s=\"" + test6 + "\" → " + result6);

        String test7 = "()()";
        int result7 = solution.longestValidParentheses(test7);
        System.out.println("Test 7 (Custom): s=\"" + test7 + "\" → " + result7);
    }
}
