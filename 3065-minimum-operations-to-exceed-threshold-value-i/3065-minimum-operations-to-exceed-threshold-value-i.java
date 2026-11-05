class Solution 
{
    public int minOperations(int[] nums, int k) 
    {
        int i,c=0,n=nums.length;

        for(i=0;i<n;i++)
        {
            if(nums[i]<k)
                c++;
        }    

        return c;
        
    }
}