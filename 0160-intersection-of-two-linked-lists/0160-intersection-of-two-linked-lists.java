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
public class Solution 
{
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
        if(headA==null || headB==null)
            return null;

        int a_sz = findSize(headA);
        int b_sz = findSize(headB);

        if(a_sz>b_sz)
        {
            int diff = a_sz-b_sz;

            while(diff>0)
            {
                headA = headA.next;
                diff-=1;
            }
        }

        else
        {
            int diff = b_sz-a_sz;

            while(diff>0)
            {
                headB = headB.next;
                diff-=1;
            }
        }

        ListNode tempA = headA;
        ListNode tempB = headB;

        while(tempA!=tempB)
        {
            tempA = tempA.next;
            tempB = tempB.next;
        }

        return tempA;

    }

    public int findSize(ListNode temp)
    {
        int sz=0;

        while(temp!=null)
        {
            sz++;
            temp=temp.next;
        }

        return sz;

    }
}