class Solution 
{
    public String defangIPaddr(String address) 
    {
        String res="";
        int i;

        for(i=0;i<address.length();i++)
        {
            char ch=address.charAt(i);

            if(ch=='.')
            {
                res=res+"[.]";
            }
            else
            {
                res=res+ch;
            }
        }

        return res;

    }
}