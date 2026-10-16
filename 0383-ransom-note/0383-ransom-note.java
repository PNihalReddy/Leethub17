class Solution 
{
    public boolean canConstruct(String ransomNote, String magazine) 
    {
        int a[] = new int[26];

        for(char ch: magazine.toCharArray())
        {
            a[ch-'a']++;
        }

        int i;

        for(i=0;i<ransomNote.length();i++)
        {
            char ch = ransomNote.charAt(i);
            int idx = ch-'a';

            a[idx] = a[idx]-1;

            if(a[idx]<0)
                return false;
        }

        return true;

    }
}