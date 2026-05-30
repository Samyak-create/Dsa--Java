package linkedlist;

public class CircularArrayLoop {

    /*
     * Day 11 - Circular Array Loop
     *
     * Approach:
     * Floyd's Cycle Detection
     * (Slow and Fast Pointer)
     *
     * Idea:
     * - Start from every index
     * - Slow moves one step
     * - Fast moves two steps
     * - Check direction consistency
     * - Ignore cycle of length 1
     * - If slow and fast meet,
     *   valid cycle exists
     *
     * Time Complexity  : O(n²)
     * Space Complexity : O(1)
     */

    public boolean circularArrayLoop(
            int[] nums
    ) {

        int n =
                nums.length;

        for (
                int i = 0;
                i < n;
                i++
        ) {

            int slow =
                    i;

            int fast =
                    i;

            boolean isForward =
                    nums[i] > 0;

            while (true) {

                slow =
                        nextIndex(
                                nums,
                                isForward,
                                slow
                        );

                fast =
                        nextIndex(
                                nums,
                                isForward,
                                fast
                        );

                if (fast != -1) {

                    fast =
                            nextIndex(
                                    nums,
                                    isForward,
                                    fast
                            );
                }

                if (
                        slow == -1
                        ||
                        fast == -1
                        ||
                        slow == fast
                ) {
                    break;
                }
            }

            if (
                    slow != -1
                    &&
                    slow == fast
            ) {
                return true;
            }
        }

        return false;
    }

    private int nextIndex(
            int[] nums,
            boolean isForward,
            int current
    ) {

        boolean direction =
                nums[current] > 0;

        if (
                isForward != direction
        ) {
            return -1;
        }

        int n =
                nums.length;

        int next =
                (current + nums[current]) % n;

        if (next < 0) {
            next += n;
        }

        if (next == current) {
            return -1;
        }

        return next;
    }
}