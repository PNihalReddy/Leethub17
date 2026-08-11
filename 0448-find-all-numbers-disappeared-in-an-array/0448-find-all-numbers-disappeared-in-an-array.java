class Solution 
{
    public List<Integer> findDisappearedNumbers(int[] nums) 
    {
        Set<Integer> s = new HashSet<>();
        List<Integer>  l = new ArrayList<>();

        for(int ele : nums)
        {
            s.add(ele);
        }

        int i;
        for(i=1;i<=nums.length;i++)
        {
            if(!s.contains(i))
            {
                l.add(i);
            }
        }

        return l;

    }
}