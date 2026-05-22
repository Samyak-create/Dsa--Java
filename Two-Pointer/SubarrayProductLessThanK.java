

public class SubarrayProductLessThanK {

    /*
     * Day 3 - Subarray Product Less Than K
     *
     * Approach:
     * Sliding Window
     *
     * Idea:
     * - Expand window using right
     * - Shrink when product exceeds limit
     * - Count valid subarrays
     *
     * Example:
     * [10,5,2,6]
     * k = 100
     *
     * Output:
     * 8
     *
     * Time Complexity  : O(n)
     * Space Complexity : O(1)
     */

    public int numSubarrayProductLessThanK(
            int[] nums,
            int k
    ) {

        if (k <= 1) {

            return 0;
        }

        int left = 0;

        int count = 0;

        int product = 1;

        for (int right = 0; right < nums.length; right++) {

            product *= nums[right];

            while (product >= k) {

                product /= nums[left];

                left++;
            }

            count += right - left + 1;
        }

        return count;
    }
}