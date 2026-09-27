class Solution 
{
    public int distinctPrimeFactors(int[] nums) 
    {
        Set<Integer> s = new HashSet<>();

        for(int n : nums)
        {
            int d;
            
            for(d=2;d*d<=n;d++)
            {
                if(n%d==0)
                {
                    s.add(d);

                    while(n%d==0)
                    {
                        n/=d;
                    }
                }
            }

            if(n>1)
            {
                s.add(n);
            }
        }

        int ans=s.size();
        return ans;

    }
}