class Solution 
{
    public double findMaxAverage(int[] nums, int k) 
    {
        double s1=0;

        for(int i=0;i<k;i++)
        {
            s1+=nums[i];
        }

        double max_sum=s1;

        for(int i=k;i<nums.length;i++)
        {
            s1+=nums[i]-nums[i-k];
            max_sum=Math.max(s1,max_sum);
        }

        double ans = max_sum/k;
        return ans;

    }
}