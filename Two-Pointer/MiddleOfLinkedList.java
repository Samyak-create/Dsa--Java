package linkedlist;

public class MiddleOfLinkedList {

    /*
     * Day 8 - Middle Of Linked List
     *
     * Approach:
     * Slow and Fast Pointer
     *
     * Idea:
     * - slow moves 1 step
     * - fast moves 2 steps
     * - when fast reaches end
     *   slow reaches middle
     *
     * Time Complexity  : O(n)
     * Space Complexity : O(1)
     */

    public ListNode middleNode(
            ListNode head
    ) {

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
        }

        return slow;
    }
}