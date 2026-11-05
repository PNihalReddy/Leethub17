class Solution 
{
    public int numberOfMatches(int n) 
    {
        int temp=n,c=0;

        while(temp>1)
        {
            if(temp%2==0)
            {
                c+=temp/2;
                temp/=2;
            }

            else
            {
                c+=(temp-1)/2;
                temp=(temp-1)/2+1;
            }
        }

        return c;

    }
}