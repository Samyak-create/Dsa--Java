

public class ReverseString {

    /*
     * Day 1 - Reverse String
     *
     * Approach:
     * Two Pointer
     *
     * Thought Process:
     * - Start from both ends
     * - Exchange characters
     * - Move inward
     *
     * Example:
     * ['h','e','l','l','o']
     *
     * Result:
     * ['o','l','l','e','h']
     *
     * Time  : O(n)
     * Space : O(1)
     */

    public void reverseString(char[] s) {

        int left = 0;

        int right = s.length - 1;

        while (left < right) {

            char temp = s[left];

            s[left] = s[right];

            s[right] = temp;

            left++;

            right--;
        }
    }
}