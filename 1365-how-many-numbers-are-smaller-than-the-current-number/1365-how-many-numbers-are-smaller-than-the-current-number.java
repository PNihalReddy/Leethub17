class Solution 
{
    public int[] smallerNumbersThanCurrent(int[] nums) 
    {
        int n = nums.length;
        int a[] = new int[n];
        int i,j,c;

        for(i=0;i<n;i++)
        {
            c=0;
            for(j=0;j<n;j++)
            {
                if(nums[j]<nums[i])
                {
                    c++;
                }   
            }
            a[i]=c;
        }    

        return a;
        
    }
}