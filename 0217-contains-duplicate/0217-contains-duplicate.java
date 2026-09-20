class Solution 
{
    public boolean containsDuplicate(int[] nums) 
    {
        Set<Integer> s = new HashSet<>();

        for(int ele : nums)
        {
            if(s.contains(ele))
            {
                return true;
            }

            else
            {
                s.add(ele);
            }
        }

        return false;

    }
}