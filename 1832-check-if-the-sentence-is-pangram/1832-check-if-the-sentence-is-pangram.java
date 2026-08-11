class Solution 
{
    public boolean checkIfPangram(String sentence) 
    {
        int i;
        int max=Integer.MIN_VALUE;
        int n=sentence.length();

        for(i=0;i<n;i++)
        {
            char ch = sentence.charAt(i);

            if(ch>max)
            {
                max=ch;
            }
        }

        int f[] = new int[max+1];

        for(i=0;i<n;i++)
        {
            char ch = sentence.charAt(i);
            f[ch]++;
        }

        int l=f.length;
        int count=0;

        for(i=0;i<=max;i++)
        {
            if(f[i]>0)
            {
                count++;
            }
        }

        if(count==26)
        {
            return true;
        }

        return false;

    }
}