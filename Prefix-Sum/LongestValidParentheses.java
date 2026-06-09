package stack;

import java.util.Stack;

public class LongestValidParentheses {

    /*
     * Day 22 - Longest Valid Parentheses
     *
     * Approach:
     * Stack
     *
     * Idea:
     * - Store indices in stack
     * - Push -1 initially as base index
     * - Push index of every '('
     * - For every ')', pop one element
     * - If stack becomes empty,
     *   push current index as new base
     * - Otherwise calculate valid length
     *   using current index and stack top
     *
     * Time Complexity  : O(n)
     * Space Complexity : O(n)
     */

    public int longestValidParentheses(
            String s
    ) {

        Stack<Integer> stack =
                new Stack<>();

        stack.push(-1);

        int maxLength = 0;

        for (
                int i = 0;
                i < s.length();
                i++
        ) {

            if (
                    s.charAt(i) == '('
            ) {

                stack.push(i);

            } else {

                stack.pop();

                if (
                        stack.isEmpty()
                ) {

                    stack.push(i);

                } else {

                    maxLength =
                            Math.max(
                                    maxLength,
                                    i - stack.peek()
                            );
                }
            }
        }

        return maxLength;
    }
}