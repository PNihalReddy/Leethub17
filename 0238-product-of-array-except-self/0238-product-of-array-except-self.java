class Solution 
{
    public int[] productExceptSelf(int[] nums) 
    {
        int n = nums.length;
        int a[] = new int[n];

        int i;

        a[0]=1;
        for(i=1;i<n;i++)
        {
            a[i]=a[i-1]*nums[i-1];
        }

        int suffix=1;
        for(i=n-1;i>=0;i--)
        {
            a[i]=a[i]*suffix;
            suffix=suffix*nums[i];
        }

        return a;
        
    }
}