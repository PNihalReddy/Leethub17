class Solution 
{
    public int findKthLargest(int[] nums, int k) 
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int ele : nums)
        {
            pq.add(ele);
        }

        int i;

        for(i=1;i<k;i++)
        {
            pq.remove();
        }

        int ans=pq.remove();
        return ans;

    }
}   