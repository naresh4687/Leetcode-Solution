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
    public ListNode swapPairs(ListNode head) {
       if(head==null || head.next==null)return head;
       ListNode prev=null;
       ListNode newhead=head.next;
       ListNode temp=head;
       while(temp!=null && temp.next!=null){
        ListNode temp1=temp.next;
        ListNode nextpair=temp1.next;
        temp1.next=temp;
        temp.next=nextpair;
        if(prev!=null){
            prev.next=temp1;
        }
        prev=temp;;
        temp=nextpair;
       }
       return newhead; 
    }
}