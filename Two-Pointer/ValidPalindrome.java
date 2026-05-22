

public class ValidPalindrome {

    /*
     * Day 3 - Valid Palindrome
     *
     * Approach:
     * Two Pointer
     *
     * Idea:
     * - Convert string into lowercase
     * - Ignore spaces and symbols
     * - Compare characters from both ends
     *
     * Example:
     * "A man, a plan, a canal: Panama"
     *
     * Output:
     * true
     *
     * Time Complexity  : O(n)
     * Space Complexity : O(1)
     */

    public boolean isPalindrome(String s) {

        s = s.toLowerCase();

        int left = 0;

        int right = s.length() - 1;

        while (left < right) {

            while (left < right &&
                    !Character.isLetterOrDigit(s.charAt(left))) {

                left++;
            }

            while (left < right &&
                    !Character.isLetterOrDigit(s.charAt(right))) {

                right--;
            }

            if (s.charAt(left) != s.charAt(right)) {

                return false;
            }

            left++;

            right--;
        }

        return true;
    }
}