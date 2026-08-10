class Solution 
{
    public String gcdOfStrings(String str1, String str2) 
    {
        while(!str2.isEmpty())
        {
            if(str2.length() > str1.length())
            {
                String t=str1;
                str1=str2;
                str2=t;
            }

            if(!str1.startsWith(str2))
            {
                return "";
            }

            String r = str1.substring(str2.length());
            str1=str2;
            str2=r;
        }

        return str1;

    }
}