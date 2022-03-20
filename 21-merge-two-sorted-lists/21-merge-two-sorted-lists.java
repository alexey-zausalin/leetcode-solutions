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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = null;
        ListNode current = new ListNode();

        ListNode node1 = list1;
        ListNode node2 = list2; 

        while (node1 != null || node2 != null) {
            if (node1 == null) {
                if (head == null) {
                    return node2;
                }
                current.next = node2;
                break;
            } else if (node2 == null) {
                if (head == null) {
                    return node1;
                }
                current.next = node1;
                break;
            } else if (node1.val < node2.val) {
                current.next = node1;
                node1 = node1.next;
            } else {
                current.next = node2;
                node2 = node2.next;
            }

            if (head == null) {
                head = current.next;
            }
                    
            current = current.next;
        }
        
        return head;
    }
}