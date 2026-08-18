class Solution 
{
    public boolean isPowerOfTwo(int n) 
    {
        if(n<=0)
        {
            return false;
        }

        String ele = Integer.toBinaryString(n);
        int count=0;

        for(int i=0;i<ele.length();i++)
        {
            char c = ele.charAt(i);

            if(c=='1')
            {
                count++;
            }

            if(count>1)
            {
                return false;
            }
        }

        return true;

    }
}