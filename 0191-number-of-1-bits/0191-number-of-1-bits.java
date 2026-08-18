class Solution 
{
    public int hammingWeight(int n) 
    {
        int count=0;
        int temp=n;

        while(temp>0)
        {
            count=count+temp%2;
            temp/=2;
        }

        return count;

    }
}