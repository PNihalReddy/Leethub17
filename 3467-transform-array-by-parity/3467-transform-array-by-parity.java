class Solution 
{
    public int[] transformArray(int[] nums) 
    {
        int i=0,oc=0,ec=0,n=nums.length;

        for(i=0;i<n;i++)
        {
            if(nums[i]%2==0)
                ec++;
            else
                oc++;
        }    

        i=0;

        while(i<ec)
        {
            nums[i]=0;
            i++;
        }

        while(i>=ec && i<n)
        {
            nums[i]=1;
            i++;
        }

        return nums;

    }
}