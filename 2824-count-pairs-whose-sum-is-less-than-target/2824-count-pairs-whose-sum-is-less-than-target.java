class Solution 
{
    public int countPairs(List<Integer> nums, int target) 
    {
        int i,j,c=0;
        int n = nums.size();

        for(i=0;i<n-1;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if((nums.get(i)+nums.get(j)<target))
                    c++;
            }
        }    

        return c;

    }
}