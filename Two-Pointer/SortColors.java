package twopointer;

public class SortColors {

    /*
     * Day 4 - Sort Colors
     *
     * Approach:
     * Dutch National Flag Algorithm
     *
     * Idea:
     * - low   → position for 0
     * - mid   → current element
     * - high  → position for 2
     *
     * Rules:
     * - 0 → swap with low
     * - 1 → move ahead
     * - 2 → swap with high
     *
     * Example:
     * [2,0,2,1,1,0]
     *
     * Output:
     * [0,0,1,1,2,2]
     *
     * Time Complexity  : O(n)
     * Space Complexity : O(1)
     */

    public void sortColors(int[] nums) {

        int low = 0;

        int mid = 0;

        int high = nums.length - 1;

        while (mid <= high) {

            if (nums[mid] == 0) {

                int temp = nums[mid];

                nums[mid] = nums[low];

                nums[low] = temp;

                low++;

                mid++;

            } else if (nums[mid] == 1) {

                mid++;

            } else {

                int temp = nums[mid];

                nums[mid] = nums[high];

                nums[high] = temp;

                high--;
            }
        }
    }
}