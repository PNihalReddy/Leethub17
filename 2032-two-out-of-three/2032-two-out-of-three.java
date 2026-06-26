class Solution 
{
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) 
    {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        Set<Integer> s3 = new HashSet<>();
        Set<Integer> res = new HashSet<>();

        for(int num: nums1)
        {
            s1.add(num);
        }

         for(int num: nums2)
        {
            s2.add(num);

            if(s1.contains(num))
            {
                res.add(num);
            }
        }

         for(int num: nums3)
        {
            s3.add(num);

            if(s1.contains(num) || s2.contains(num))
            {
                res.add(num);
            }
        }

        return new ArrayList<>(res);
        
    }
}