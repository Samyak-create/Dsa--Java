package prefixsum;

public class NumberOfSubarraysWithBoundedMaximum {

    /*
     * Day 23 - Number of Subarrays
     * With Bounded Maximum
     *
     * Approach:
     * Inclusion-Exclusion + Counting
     *
     * Idea:
     * - Count all subarrays whose
     *   maximum element is <= right
     * - Count all subarrays whose
     *   maximum element is <= left - 1
     * - Subtract both counts
     *
     * Formula:
     * count(right)
     * -
     * count(left - 1)
     *
     * Helper Function:
     * - curr stores length of current
     *   valid streak
     * - If num <= bound:
     *      curr++
     *      count += curr
     * - Else:
     *      curr = 0
     *
     * Time Complexity : O(n)
     * Space Complexity: O(1)
     */

    public int numSubarrayBoundedMax(
            int[] nums,
            int left,
            int right
    ) {

        return countSubarrays(
                nums,
                right
        ) - countSubarrays(
                nums,
                left - 1
        );
    }

    private int countSubarrays(
            int[] nums,
            int bound
    ) {

        int count = 0;
        int curr = 0;

        for (int num : nums) {

            if (num <= bound) {

                curr++;
                count += curr;

            } else {

                curr = 0;
            }
        }

        return count;
    }
}