package greedy;

public class TaskScheduler {

    /*
     * Day 32 - Task Scheduler
     *
     * Approach:
     * Greedy + Math
     *
     * Idea:
     * - Count frequency of
     *   each task
     * - Find the maximum
     *   frequency
     * - Create blocks based
     *   on the most frequent task
     * - Fill remaining tasks
     *   into those blocks
     * - Result is the maximum
     *   of:
     *      1. Calculated schedule
     *      2. Total tasks count
     *
     * Formula:
     * (maxFreq - 1) * (n + 1)
     *      + countMaxFreq
     *
     * Time Complexity:
     * O(tasks.length)
     *
     * Space Complexity:
     * O(1)
     */

    public int leastInterval(
            char[] tasks,
            int n
    ) {

        int[] freq =
                new int[26];

        int maxFreq = 0;

        for (
                char task : tasks
        ) {

            freq[task - 'A']++;

            maxFreq =
                    Math.max(
                            maxFreq,
                            freq[task - 'A']
                    );
        }

        int countMaxFreq = 0;

        for (
                int count : freq
        ) {

            if (
                    count == maxFreq
            ) {

                countMaxFreq++;
            }
        }

        int intervals =
                (maxFreq - 1)
                        * (n + 1)
                        + countMaxFreq;

        return Math.max(
                intervals,
                tasks.length
        );
    }
}