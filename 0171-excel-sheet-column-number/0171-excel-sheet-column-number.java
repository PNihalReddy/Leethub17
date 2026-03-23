class Solution 
{
    public int titleToNumber(String columnTitle) 
    {
        int i,res=0;

        for(i=0;i<columnTitle.length();i++)
        {
            int val=columnTitle.charAt(i)-'A'+1;
            res=res*26+val;
        }

        return res;

    }
}