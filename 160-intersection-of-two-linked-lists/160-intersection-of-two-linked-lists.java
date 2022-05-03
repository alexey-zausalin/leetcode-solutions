/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        
        ListNode nodeA = headA, nodeB = headB;
        while (nodeA != nodeB) {
            nodeA = nodeA == null ? headB : nodeA.next;
            nodeB = nodeB == null ? headA : nodeB.next;
        }
        
        return nodeA;
    }
    public ListNode getIntersectionNodeV2(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet();
        while (headA != null || headB != null) {
            if (headA != null) {
                if (set.contains(headA)) {
                    return headA;
                } else {
                    set.add(headA);
                    headA = headA.next;
                }
            }
            
            if (headB != null) {
                if (set.contains(headB)) {
                    return headB;
                } else {
                    set.add(headB);
                    headB = headB.next;
                }
            }
        }
        
        return null;
    }
}