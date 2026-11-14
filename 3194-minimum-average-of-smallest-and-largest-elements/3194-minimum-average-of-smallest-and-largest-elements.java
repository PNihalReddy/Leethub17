class Solution 
{
    public double minimumAverage(int[] nums) 
    {
        Arrays.sort(nums);
        double min_avg = Double.MAX_VALUE;
        int i,n = nums.length;

        for(i=0;i<=n/2;i++)
        {
            double avg = (nums[i]+nums[n-i-1])/2.0;

            if(avg<min_avg)
                min_avg = avg;
        }

        return min_avg;

    }
}