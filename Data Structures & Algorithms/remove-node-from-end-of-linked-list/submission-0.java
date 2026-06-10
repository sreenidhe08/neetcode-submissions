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
    public int findl(ListNode head)
    {
        int count=0;
        ListNode temp = head;
        while(temp!=null)
        {
            temp=temp.next;
            count++;
        }
        return count;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        if(head==null) return head;
        int l=findl(head); //4
        int a=l-n;//2
        if(n>l) return head;
        if(a==0) return head.next;
        int i=0;
        ListNode p=head;
        while(i<a-1) 
        {
            i++;
            p=p.next;
        }
        p.next=p.next.next;
        return head; 
    }
}
