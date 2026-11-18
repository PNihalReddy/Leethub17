class Solution 
{
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) 
    {
        int i,s1=0,n=nums.size();

        for(i=0;i<n;i++)
        {
            if(Integer.bitCount(i)==k)
                s1+=nums.get(i);
        }

        return s1;

    }
}