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
     public int pairSum(ListNode head) 
    {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp = slow;
        ListNode prev = null;
        ListNode next = null;
        while(temp != null)
        {
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        ListNode right = prev;
        ListNode left = head;
        int max = 0;
        while(right != null)
        {
            max = Math.max(max, left.val + right.val);
            left = left.next;
            right = right.next;
        }
        return max;
    }
}