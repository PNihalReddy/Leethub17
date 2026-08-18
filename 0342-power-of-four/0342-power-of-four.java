class Solution 
{
    public boolean isPowerOfFour(int n) 
    {
        if(n<=0)
        {
            return false;
        }    

        int temp=n;

        while(temp%4==0)
        {
            temp/=4;    
        }

        return temp==1;

    }
}