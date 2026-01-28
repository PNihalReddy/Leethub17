class Solution 
{
    public int largestAltitude(int[] gain) 
    {
        int altitude=0;
        int i,max=0;

        for(i=0;i<gain.length;i++)
        {
            altitude=altitude+gain[i];

            if (altitude>max)
            {
                max=altitude;
            }
        }

        return max;

    }
}
