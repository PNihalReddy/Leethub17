import java.util.Arrays;

class Solution
{
    public int largestPerimeter(int[] nums) 
    {
        Arrays.sort(nums);

        int i;

        for(i=nums.length-1;i>=2;i--)
        {
            if(nums[i-1]+nums[i-2]>nums[i])
            {
                int x=nums[i]+nums[i-1]+nums[i-2];
                return x;
            }
        }

        return 0;
    }
}
