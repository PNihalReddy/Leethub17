class Solution 
{
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) 
    {
        int i,c=0,n=hours.length;

        for(i=0;i<n;i++)
        {
            if(hours[i]>=target)
                c++;
        }

        return c;
        
    }
}