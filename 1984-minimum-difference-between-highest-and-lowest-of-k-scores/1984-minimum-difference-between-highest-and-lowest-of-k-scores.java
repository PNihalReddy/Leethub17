class Solution 
{
    public int minimumDifference(int[] nums, int k) 
    {
        int i;
        int n = nums.length;
        int min_diff = Integer.MAX_VALUE;
        Arrays.sort(nums);
        
        for(i=0;i+k-1<n;i++)
        {
            int diff = nums[i+k-1] - nums[i];

            if(diff<min_diff)
            {
                min_diff = diff;
            }
        }    

        return min_diff;

    }
}