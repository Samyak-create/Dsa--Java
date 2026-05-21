

public class MoveZeroes {

    /*
     * Day 1 - Move Zeroes
     *
     * Approach:
     * Two Pointer + Swapping
     *
     * Thought Process:
     * - Keep one pointer at position where next non-zero should go
     * - Traverse entire array
     * - Whenever non-zero found:
     *      → Swap with left position
     *      → Move left ahead
     *
     * Example:
     * [0,1,0,3,12]
     *
     * After processing:
     * [1,3,12,0,0]
     *
     * Time  : O(n)
     * Space : O(1)
     */

    public void moveZeroes(int[] nums) {

        int left = 0;

        for (int right = 0; right < nums.length; right++) {

            // Non-zero should come forward
            if (nums[right] != 0) {

                int temp = nums[right];

                nums[right] = nums[left];

                nums[left] = temp;

                left++;
            }
        }
    }
}
