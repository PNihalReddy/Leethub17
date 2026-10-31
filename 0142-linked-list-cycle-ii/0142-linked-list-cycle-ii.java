/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution 
{
    public ListNode detectCycle(ListNode head) 
    {
        ListNode slow = head;
        ListNode fast = head;
        ListNode temp = null;

        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if(slow==fast)
            {
                temp=slow;
                break;
            }
        }    

        if(temp==null)
            return null;


        ListNode start = head;

        if(temp==start)
            return start;
            

        while(start!=null && temp!=null)
        {
            start = start.next;
            temp = temp.next;

            if(start==temp)
                return start;
        }       

        return null;

    }
}