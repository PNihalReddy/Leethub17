class Solution 
{
    public int countSymmetricIntegers(int low, int high) 
    {
        int i,count=0;

        for(i=low;i<=high;i++)
        {
            if(i>=10 && i<=99)
            {
                if(i%10 == i/10)
                {
                    count++;
                }
            }

            else if(i>=1000 && i<=9999)
            {
                int d1=i/1000;
                int d2=(i/100)%10;
                int d3=(i/10)%10;
                int d4=i%10;

                if(d1+d2 == d3+d4)
                {
                    count++;
                }
            }
        }

        return count;

    }
}