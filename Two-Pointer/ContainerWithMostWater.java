

public class ContainerWithMostWater {

    /*
     * Day 2 - Container With Most Water
     *
     * Approach:
     * Two Pointer + Greedy
     *
     * Idea:
     * - Water depends on:
     *      width × minimum height
     *
     * - Calculate current area
     * - Store maximum
     * - Move pointer with smaller height
     *
     * Reason:
     * - Smaller wall limits container size
     *
     * Time Complexity  : O(n)
     * Space Complexity : O(1)
     */

    public int maxArea(int[] height) {

        int left = 0;

        int right = height.length - 1;

        int maxArea = 0;

        while (left < right) {

            int width = right - left;

            int currentArea =
                    Math.min(height[left], height[right]) * width;

            maxArea = Math.max(maxArea, currentArea);

            if (height[left] < height[right]) {

                left++;

            } else {

                right--;
            }
        }

        return maxArea;
    }
}