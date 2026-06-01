

public class MaximumAverageSubarrayI {

    /*
     * Day 13 - Maximum Average Subarray I
     *
     * Approach:
     * Fixed Size Sliding Window
     *
     * Idea:
     * - Maintain a window of size k
     * - Add current element to window sum
     * - Remove left element when window size exceeds k
     * - Calculate average when window size becomes k
     * - Track maximum average
     *
     * Time Complexity  : O(n)
     * Space Complexity : O(1)
     */

    public double findMaxAverage(
            int[] nums,
            int k
    ) {

        int left = 0;

        int sum = 0;

        int length = 0;

        double maxAverage =
                Double.NEGATIVE_INFINITY;

        for (
                int right = 0;
                right < nums.length;
                right++
        ) {

            while (
                    length == k
            ) {

                sum -= nums[left];

                length--;

                left++;
            }

            sum += nums[right];

            length++;

            if (
                    length == k
            ) {

                double average =
                        (double) sum / k;

                maxAverage =
                        Math.max(
                                maxAverage,
                                average
                        );
            }
        }

        return maxAverage;
    }
}