class Solution 
{
    public int[] findErrorNums(int[] nums) 
    {
        int n=nums.length;
        int i;

        int f[] = new int[n+1];
        for(i=0;i<n;i++)
        {
            f[nums[i]]++;
        }

        int ele1=0,ele2=0;

        for(i=1;i<f.length;i++)
        {
            if(f[i]==2)
            {
                ele1=i;
            }
            if(f[i]==0)
            {
                ele2=i;
            }
        }

        return new int[] {ele1,ele2};

    }
}