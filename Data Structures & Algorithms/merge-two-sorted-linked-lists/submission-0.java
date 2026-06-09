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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
    {
        if(list1==null)
        return list2;
        if(list2==null)
        {
            return list1;
        }
        if(list1==null && list2==null) return null;
        ListNode h1 = list1;
        ListNode h2 = list2;
        ListNode head=null;
        if(h1.val<=h2.val)
        {
            head=h1;
            h1=h1.next;
        }
        else
        {
            head=h2;
            h2=h2.next;
        }
        ListNode t = head;
        while(h1!=null && h2!=null)
        {
            if(h1.val<=h2.val)
        {
            t.next=h1;
            h1=h1.next;
            t=t.next;
        }
        else
        {
            t.next=h2;
            h2=h2.next;
            t=t.next;
        }
        }
        while(h1!=null)
        {
           t.next=h1;
            h1=h1.next;
            t=t.next; 
        }
        while(h2!=null)
        {
           t.next=h2;
            h2=h2.next;
            t=t.next; 
        }
        return head;
    }
}