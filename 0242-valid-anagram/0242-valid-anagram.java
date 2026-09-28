class Solution 
{
    public boolean isAnagram(String s, String t) 
    {
        if(s.length()!=t.length())
        {
            return false;
        }

        int counts[] = new int[26];
        int i;

        for(i=0;i<s.length();i++)
        {
            char chs = s.charAt(i);
            char cht = t.charAt(i);

            counts[chs-'a']++;
            counts[cht-'a']--;

        }

        for(int ele : counts)
        {
            if(ele!=0)
            {
                return false;
            }
        }

        return true;

    }
}