class Solution 
{
    public int findDuplicate(int[] nums) 
    {
        int n = nums.length;

        int f[] = new int[n+1];
        int i;

        for(i=0;i<n;i++)
        {
            f[nums[i]]++;
        }

        int ans=-1;

        for(i=1;i<f.length;i++)
        {
            if(f[i]>1)
            {
                return i;
            }
        }

        return -1;

    }
}