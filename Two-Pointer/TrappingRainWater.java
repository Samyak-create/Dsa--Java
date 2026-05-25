package twopointer;

public class TrappingRainWater {

    /*
     * Day 6 - Trapping Rain Water
     *
     * Approach:
     * Two Pointer
     *
     * Idea:
     * - Keep max height from left and right
     * - Water stored =
     *      smallerMax - currentHeight
     *
     * Time Complexity  : O(n)
     * Space Complexity : O(1)
     */

    public int trap(int[] height) {

        int left = 0;

        int right = height.length - 1;

        int leftMax = 0;

        int rightMax = 0;

        int totalWater = 0;

        while (left < right) {

            leftMax =
                    Math.max(
                            leftMax,
                            height[left]
                    );

            rightMax =
                    Math.max(
                            rightMax,
                            height[right]
                    );

            if (leftMax < rightMax) {

                totalWater +=
                        leftMax
                        - height[left];

                left++;

            } else {

                totalWater +=
                        rightMax
                        - height[right];

                right--;
            }
        }

        return totalWater;
    }
}