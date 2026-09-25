class Solution 
{
    public int findKthLargest(int[] nums, int k) 
    {
        Arrays.sort(nums);
        int i,c=1;
        int ans=0;

        for(i=nums.length-1;i>=0;i--)
        {
            if(c==k)
            {
                ans=nums[i];
            }

            c++;

        }

        return ans;

    }
}