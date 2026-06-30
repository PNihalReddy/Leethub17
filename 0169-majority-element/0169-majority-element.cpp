class Solution 
{
public:
    int majorityElement(vector<int>& nums) 
    {
        int n=nums.size();

        int i,f=0,ans=0;
        
        for(i=0;i<n;i++)
        {
            if(f==0)
            {
                ans=nums[i];
            }

            if(nums[i]==ans)
            {
                f++;
            }

            else
            {
                f--;
            }
        }

        return ans;
        
    }
};