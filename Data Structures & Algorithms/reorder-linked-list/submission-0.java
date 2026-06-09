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
    public ListNode rev(ListNode head)
    {
        ListNode front=null;
        ListNode prev=null;
        ListNode cur=head;
        while(cur!=null)
        {
            front=cur.next;
            cur.next=prev;
            prev=cur;
            cur=front;
        }  
        return prev;      
    }
    public void reorderList(ListNode head) 
    {
        if(head==null || head.next==null||head.next.next==null)
        return;
        ListNode fast=head;
        ListNode slow=head;
       while(fast!=null && fast.next!=null)
       {
        slow=slow.next;
        fast=fast.next.next;
       }
       ListNode second = slow.next;
        slow.next = null;
        second = rev(second);

       ListNode first = head;

        while(second != null)
        {
            ListNode t1 = first.next;
            ListNode t2 = second.next;

            first.next = second;
            second.next = t1;

            first = t1;
            second = t2;
        }
    }
}
