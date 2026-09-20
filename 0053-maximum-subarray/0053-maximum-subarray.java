class Solution 
{
    public int maxSubArray(int[] nums) 
    {
        int s1=0;
        int max_sum = Integer.MIN_VALUE;

        for(int ele : nums)
        {
            s1+=ele;

            if(s1>max_sum)
            {
                max_sum=s1;
            }

            if(s1<0)
            {
                s1=0;
            }
        }

        return max_sum;

    }
}