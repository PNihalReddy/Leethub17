class Solution 
{
    public boolean validPalindrome(String s) 
    {
        int l=0,r=s.length()-1;

        while(l<r)
        {
            if(s.charAt(l)!=s.charAt(r))
            {
                return palindromeRange(s,l,r-1) || palindromeRange(s,l+1,r);
            }

            l++;
            r--;
        }

        return true;

    }

    private boolean palindromeRange(String s, int i,int j)
    {
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }

            i++;
            j--;

        }

        return true;

    }
}