class Solution 
{
    public List<Integer> findMissingElements(int[] nums) 
    {
        List<Integer> ans = new ArrayList<>();
        Set<Integer> s = new HashSet<>();

        int max=nums[0],min=Integer.MAX_VALUE;

        for(int ele : nums)
        {
            if(ele>max)
                max=ele;
            
            if(ele<min)
                min=ele;
            
            s.add(ele);
        }

        for(int i=min;i<=max;i++)
        {
            if(!s.contains(i))
                ans.add(i);
        }

        return ans;
        
    }
}