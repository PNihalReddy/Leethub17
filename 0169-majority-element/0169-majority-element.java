class Solution 
{
    public int majorityElement(int[] nums) 
    {
        int ans = nums[0];
        int i,c=0;

        for(i=0;i<nums.length;i++)
        {
            if(c==0)
            {
                ans=nums[i];
            }


            if(nums[i]==ans)
            {
                c++;
            }

            else
            {
                c--;
            }

        }

        return ans;
        
    }
}