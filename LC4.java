public class LC4 
{
    public int minOperations(int[] nums, int k) 
    {
        int n=nums.length;

        long even[] = new long[k];
        long odd[] = new long[k];
        int r,i;

        for(r=0;r<k;r++)
        {
            for(i=0;i<n;i=i+2)
            {
                int rema=nums[i]%k;
                even[r]=even[r]+Math.min(Math.abs(rema-r), k-Math.abs(rema-r));
            }

            for(i=1;i<n;i=i+2)
            {
                int rema=nums[i]%k;
                odd[r]=odd[r]+Math.min(Math.abs(rema-r), k-Math.abs(rema-r));
            }
        }

        long ops=Long.MAX_VALUE;

        int x,y;

        for(x=0;x<k;x++)
        {
            for(y=0;y<k;y++)
            {
                if(x!=y)
                {
                    ops=Math.min(ops, even[x]+odd[y]);
                }
            }
        }

        int min_ops=(int)ops;
        return min_ops;
        
    }
}