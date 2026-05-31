

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {

    /*
     * Day 12 - Longest Substring Without Repeating Characters
     *
     * Approach:
     * Sliding Window + HashSet
     *
     * Idea:
     * - Expand window using right pointer
     * - If duplicate character found,
     *   remove characters from left
     *   until window becomes unique
     * - Track maximum window length
     *
     * Time Complexity  : O(n)
     * Space Complexity : O(min(n, charset))
     */

    public int lengthOfLongestSubstring(
            String s
    ) {

        HashSet<Character> set =
                new HashSet<>();

        int left = 0;

        int maxLength = 0;

        for (int right = 0;
             right < s.length();
             right++) {

            char c =
                    s.charAt(right);

            while (
                    set.contains(c)
            ) {

                set.remove(
                        s.charAt(left)
                );

                left++;
            }

            set.add(c);

            int currentLength =
                    right - left + 1;

            maxLength =
                    Math.max(
                            maxLength,
                            currentLength
                    );
        }

        return maxLength;
    }
}