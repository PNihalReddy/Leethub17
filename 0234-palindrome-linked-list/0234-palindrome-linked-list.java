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
class Solution 
{
    public boolean isPalindrome(ListNode head) 
    {
        if(head==null || head.next==null)
            return true;

        ListNode fast=head;
        ListNode slow=head;

        while(fast!=null && fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode head2 = reverseLL(slow.next);
        slow.next=null;
        ListNode head1 = head;

        while(head1!=null && head2!=null)
        {
            if(head1.val!=head2.val)
                return false;

            head1=head1.next;
            head2=head2.next;
        }

        return true;
        
    }

    public ListNode reverseLL(ListNode curr)
    {
        ListNode prev=null,next=null;

        while(curr!=null)
        {
            next = curr.next;
            curr.next = prev;

            prev=curr;
            curr=next;
        }

        return prev;

    }
}