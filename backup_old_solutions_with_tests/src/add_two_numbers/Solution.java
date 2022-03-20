package add_two_numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    static public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        static ListNode fromArray(int[] nums) {
            if (nums.length <= 0) {
                return null;
            }

            return new ListNode(nums[0], fromArray(Arrays.copyOfRange(nums, 1, nums.length)));
        }
    }

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

    public ListNode addTwoNumbersV2(ListNode l1, ListNode l2) {
        List<Integer> result = new ArrayList<>();

        int shift = 0;
        int value = 0;
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

            result.add(value % 10);
            shift = value / 10;
        }

        return ListNode.fromArray(result.stream()
                .mapToInt(Integer::intValue)
                .toArray());
    }
}
