class Solution 
{
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        for(int ele : nums1)
        {
            s1.add(ele);
        }     

        for(int ele : nums2)
        {
            if(s1.contains(ele))
            {
                s2.add(ele);
            }
        }

        int n = s2.size();
        int ans[] = new int[n];
        int i=0;

        for(int ele : s2)
        {
            ans[i++] = ele;
        }

        return ans;

    }
}