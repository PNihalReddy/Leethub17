class Solution 
{
    public int missingNumber(int[] nums) 
    {
        int n = nums.length;
        int expected_sum=n*(n+1)/2;

        int actual_sum=0;
        for(int ele : nums)
        {
            actual_sum+=ele;
        }    

        int ans=expected_sum-actual_sum;
        return ans;
        
    }
}