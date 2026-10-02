class Solution 
{
    public int maxProduct(int[] nums) 
    {
        int p1=1,p2=1;
        int max_p = Integer.MIN_VALUE;
        int i;

        for(i=0;i<nums.length;i++)
        {
            p1*=nums[i];
            p2*=nums[nums.length-i-1];

            if(p1>max_p)
            {
                max_p=p1;
            }

            if(p2>max_p)
            {
                max_p=p2;
            }

            if(p1==0)
            {
                p1=1;
            }

            if(p2==0)
            {
                p2=1;
            }
        }

        return max_p;

    }
}