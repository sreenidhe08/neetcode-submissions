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
    public ListNode len(ListNode head,int k)
    {
      while(head!=null && k>1)
      {
        head=head.next;
        k--;
      }
      return head;
    }
    public ListNode rev(ListNode head)
    {
     if(head==null)
        return head;

        ListNode prev=null;
        ListNode cur=head;
        ListNode front=null;
        while(cur!=null)
        {
            front=cur.next;
            cur.next=prev;
            prev=cur;
            cur=front;
        }
        head=prev;
        return head;  
    }
    public ListNode reverseKGroup(ListNode head, int k) 
    {
      ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevGroupTail = dummy;

      //ListNode temp = head;
      while(head!=null)
      {
        ListNode kth = len(head, k);
        if(kth==null)
        break;
        ListNode nextgrp = kth.next;
        kth.next=null;
        ListNode revi = rev(head);
        prevGroupTail.next = revi;
        head.next = nextgrp;
        prevGroupTail = head;
        head=nextgrp;
      }
      return dummy.next;
    }
}
