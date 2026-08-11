class Solution 
{
    public boolean isIsomorphic(String s, String t) 
    {
        int s_arr[] = new int[256];
        int t_arr[] = new int[256];
        int i;

        for(i=0;i<s.length();i++)
        {
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);

            if(s_arr[ch1] != t_arr[ch2])
            {
                return false;
            }

            s_arr[ch1]=i+1;
            t_arr[ch2]=i+1;
        }

        return true;

    }
}