class Solution 
{
    public int findKthLargest(int[] nums, int k) 
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i;
        int n = nums.length;

        for(i=0;i<nums.length;i++)
        {
            pq.add(nums[i]);

            if(pq.size()>k)
            {
                pq.remove();
            }
        }    

        int ans=0;

        if(pq.isEmpty())
        {
            return 0;
        }

        else
        {
            ans = pq.peek();
        }

        return ans;
        
    }
}