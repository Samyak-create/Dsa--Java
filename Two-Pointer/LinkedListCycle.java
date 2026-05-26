package linkedlist;

public class LinkedListCycle {

    /*
     * Day 7 - Linked List Cycle
     *
     * Approach:
     * Floyd Cycle Detection
     *
     * Idea:
     * - slow → move 1 step
     * - fast → move 2 steps
     * - if both meet → cycle exists
     *
     * Time Complexity  : O(n)
     * Space Complexity : O(1)
     */

    public boolean hasCycle(
            ListNode head
    ) {

        if (
                head == null
                ||
                head.next == null
        ) {

            return false;
        }

        ListNode slow =
                head;

        ListNode fast =
                head;

        while (
                fast != null
                &&
                fast.next != null
        ) {

            slow =
                    slow.next;

            fast =
                    fast.next.next;

            if (
                    slow == fast
            ) {

                return true;
            }
        }

        return false;
    }
}