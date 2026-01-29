class Solution 
{
    public int findSpecialInteger(int[] arr) 
    {
        int n=arr.length;

        int p=n/4;

        int i,c=1;

        for(i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                c++;
            }
            else
            {
                c=1;
            }
            if(c>p)
            {
                return arr[i];
            }
        }
        return  arr[0];
    }
}