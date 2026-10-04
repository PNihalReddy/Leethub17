class Solution 
{
    public boolean canPlaceFlowers(int[] flowerbed, int n) 
    {
        int i;
        int n2 = flowerbed.length;
        boolean ans=false;

        for(i=0;i<n2;i++)
        {
            if(flowerbed[i]==0)
            {
                boolean back = (i==0 || flowerbed[i-1]==0);
                boolean front = (i==n2-1 || flowerbed[i+1]==0);

                if(back && front)
                {
                    flowerbed[i]=1;
                    n--;
                }
            }
        }

        if(n<=0)
        {
            ans=true;
        }

        else
        {
            ans=false;
        }

        return ans;
         
    }
}