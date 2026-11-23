class Solution 
{
    public String[] sortPeople(String[] names, int[] heights) 
    {
        int i,j,n = names.length;

        for(i=0;i<n-1;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                if(heights[j+1]>heights[j])
                {
                    int temp_h = heights[j];
                    heights[j] = heights[j+1];
                    heights[j+1] = temp_h;
                    
                    
                    String temp = names[j];
                    names[j] = names[j+1];
                    names[j+1] = temp;
                }
            }
        }

        return names;

    }
}