class Solution 
{
    public int xorOperation(int n, int start) 
    {
        int a[] = new int[n];
        int i=0,s1=0;

        for(i=0;i<n;i++)
        {
            a[i] = start+(2*i);
            s1^=a[i];
        }

        return s1;

    }
}