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
    public ListNode reverseList(ListNode head) {
        ListNode oldHead = null;
        ListNode newHead = head;
        
        while (newHead != null) {
            head = newHead;
            newHead = newHead.next;
            
            head.next = oldHead;
            oldHead = head;
        }
        
        return head;
    }
}