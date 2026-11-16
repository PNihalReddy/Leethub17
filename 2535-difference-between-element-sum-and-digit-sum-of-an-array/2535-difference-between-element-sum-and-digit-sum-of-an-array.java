class Solution 
{
    public int differenceOfSum(int[] nums) 
    {
        int n = nums.length;
        int i,total_sum=0,s1=0;

        for(i=0;i<n;i++)
        {
            total_sum+=nums[i];
            s1+=digit_Sum(nums[i]);
        }

        int ans = Math.abs(total_sum-s1);
        return ans;
        
    }

    public int digit_Sum(int n)
    {
        int s=0;

        while(n!=0)
        {
            int r = n%10;
            s+=r;
            n/=10;
        }

        return s;

    }
}