class Solution 
{
    public int[] numberGame(int[] nums) 
    {
        int i,n = nums.length;
        Arrays.sort(nums);

        for(i=0;i<n-1;i=i+2)
        {
            int temp = nums[i];
            nums[i] = nums[i+1];
            nums[i+1] = temp;
        }

        return nums;

    }
}