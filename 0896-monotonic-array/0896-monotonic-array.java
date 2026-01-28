class Solution 
{
    public boolean isMonotonic(int[] nums) 
    {
        int i;
        boolean inc=false;
        boolean dec=false;

        for(i=0;i<nums.length-1;i++)
        {
            if(nums[i+1]>nums[i])
            {
                inc=true;
            }
            else if(nums[i+1]<nums[i])
            {
                dec=true;
            }

            if(inc && dec)
                return false;
        }

        return true;
        
    }
}