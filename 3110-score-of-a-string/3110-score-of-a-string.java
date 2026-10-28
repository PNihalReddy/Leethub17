class Solution 
{
    public int scoreOfString(String s) 
    {
        int i,s1=0,n=s.length();

        for(i=0;i<n-1;i++)
        {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(i+1);

            s1+=Math.abs(ch1-ch2);
        }

        return s1;
        
    }
}