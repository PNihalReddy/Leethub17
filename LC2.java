public class LC2 
{
    public int passwordStrength(String password) 
    {
        String s=password;
        HashSet<Character> h = new HashSet<>();
        int i,strength=0;

        for(i=0;i<s.length();i++)
        {
            char c=s.charAt(i);

            if(!h.contains(c))
            {
                h.add(c);
                if(c>='a' && c<='z')
                {
                    strength+=1;
                }
    
                else if(c>='A' && c<='Z')
                {
                    strength+=2;
                }
    
                else if(c>='0' && c<='9')
                {
                    strength+=3;
                }
    
                else if(c=='!' || c=='@' || c=='#' || c=='$')
                {
                    strength+=5;
                }
            }
            
        }
        
        return strength;
        
    }
}