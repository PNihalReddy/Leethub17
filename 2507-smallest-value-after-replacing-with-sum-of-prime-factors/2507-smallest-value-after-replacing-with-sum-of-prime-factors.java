class Solution 
{
    public int smallestValue(int n) 
    {
        while(true)
        {
            int org = n;
            int s1=0;

            int i;

            for(i=2;i*i<=n;i++)
            {
                while(n%i==0)
                {
                    s1+=i;
                    n/=i;
                }
            }

            if(n>1)
            {
                s1+=n;
            }

            if(s1==org)
            {
                return s1;
            }

            n=s1;

        }
    }
}