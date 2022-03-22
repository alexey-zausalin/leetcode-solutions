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
    public ListNode mergeNodes(ListNode head) {
        ListNode node = head;
        while (node.next != null) {
            if (node.next.val == 0) {
                if (node.next.next == null) {
                    node.next = null;
                    break;
                }
                node = node.next;
                continue;
            }
            
            node.val += node.next.val;
            node.next = node.next.next;
        }

        return head;
    }
}