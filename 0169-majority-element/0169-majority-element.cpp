class Solution 
{
public:
    int majorityElement(vector<int>& nums) 
    {
        int n=nums.size();

        for(int val: nums)
        {
            int f=0;

            for(int elem : nums)
            {
                if(elem==val)
                {
                    f++;
                }
            }

            if(f>n/2)
            {
                return val;
            }
        }

        return -1;

    }
};