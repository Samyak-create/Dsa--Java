package twopointer;

public class SquaresOfSortedArray {

    /*
     * Day 3 - Squares of Sorted Array
     *
     * Approach:
     * Two Pointer
     *
     * Idea:
     * - Largest square comes from either end
     * - Compare absolute values
     * - Fill result array from back
     *
     * Example:
     * [-4,-1,0,3,10]
     *
     * Output:
     * [0,1,9,16,100]
     *
     * Time Complexity  : O(n)
     * Space Complexity : O(n)
     */

    public int[] sortedSquares(int[] nums) {

        int n = nums.length;

        int[] result = new int[n];

        int left = 0;

        int right = n - 1;

        int pos = n - 1;

        while (left <= right) {

            int leftSquare = nums[left] * nums[left];

            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {

                result[pos] = leftSquare;

                left++;

            } else {

                result[pos] = rightSquare;

                right--;
            }

            pos--;
        }

        return result;
    }
}