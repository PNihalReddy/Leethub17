class Solution 
{
    public int maxPower(String s) 
    {
        int i,c=1,max=1;

        for(i=1;i<s.length();i++)
        {
            char s1 = s.charAt(i);
            char s2 = s.charAt(i-1);

            if(s1==s2)
            {
                c++;
            }
            else
            {
                c=1;
            }
            
            if(c>max)
            {
                max=c;
            }
        }
        return max;
    }
}