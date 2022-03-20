/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode tail = null;

        int shift = 0;
        int value;
        while (l1 != null || l2 != null || shift != 0) {
            value = shift;

            if (l1 != null) {
                value += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                value += l2.val;
                l2 = l2.next;
            }

            shift = value / 10;

            if (head == null) {
                head = new ListNode(value % 10);
                tail = head;
            } else {
                tail.next = new ListNode(value % 10);
                tail = tail.next;
            }
        }

        return head;
    }
}