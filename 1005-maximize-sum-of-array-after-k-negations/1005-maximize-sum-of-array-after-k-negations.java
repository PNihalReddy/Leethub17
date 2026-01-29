import java.util.Arrays;

class Solution 
{
    public int largestSumAfterKNegations(int[] nums, int k) 
    {
        Arrays.sort(nums);

        int i=0;

        while(i<nums.length && nums[i]<0 && k>0)
        {
            nums[i]=-nums[i];
            i++;
            k--;
        }

        if(k%2==1)
        {
            Arrays.sort(nums);
            nums[0]=-nums[0];
        }

        int s1=0;

        for(i=0;i<nums.length;i++)
        {
            s1=s1+nums[i];
        }

        return s1;

    }
}
