class Solution 
{
    public List<Integer> findMissingElements(int[] nums) 
    {
        int i,max=nums[0],min=Integer.MAX_VALUE;
        List<Integer> ans = new ArrayList<>();

        for(int ele : nums)
        {
            if(ele>max)
                max=ele;
            
            if(ele<min)
                min=ele;
        }

        int j;

        for(i=min;i<=max;i++)
        {
            int c=0;

            for(j=0;j<nums.length;j++)
            {
                if(nums[j]==i)
                {
                    c++;
                    break;
                }
            }

            if(c==0)
                ans.add(i);
        }

        return ans;

    }
}