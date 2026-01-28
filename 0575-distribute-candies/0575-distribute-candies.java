import java.util.Arrays;

class Solution 
{
    public int distributeCandies(int[] candyType) 
    {
        Arrays.sort(candyType);

        int i,u=1;

        for(i=1;i<candyType.length;i++)
        {
            if(candyType[i]!=candyType[i-1])
            {
                u++;
            }
        }

        return Math.min(u,candyType.length/2);

    }
}
