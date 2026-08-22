class Solution 
{
    public int missingNumber(int[] nums) 
    {
        int ans=0;
        int i;
        int n = nums.length;

        for(i=0;i<=n;i++)
        {
            ans^=i;
        }

        for(int ele : nums)
        {
            ans^=ele;
        }

        return ans;
        
    }
}