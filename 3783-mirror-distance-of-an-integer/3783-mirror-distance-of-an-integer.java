class Solution 
{
    public int mirrorDistance(int n) 
    {
        int ans = Math.abs(n-reverseNum(n));
        return ans;
    }

    public int reverseNum(int n)
    {
        int temp = n;
        int rev=0;

        while(temp!=0)
        {
            int r = temp%10;
            rev = rev*10+r;
            temp/=10;
        }

        return rev;

    }
}