class Solution 
{
    public String interpret(String command) 
    {
        StringBuilder sb = new StringBuilder();
        int i;  

        for(i=0;i<command.length();i++) 
        {
            if(command.charAt(i)=='G')
            {
                sb.append('G');
            } 
            else if(command.charAt(i)=='(') 
            {
                if(command.charAt(i+1)==')')
                {
                    sb.append('o');
                    i++; 
                }
                else
                 {
                    sb.append("al");
                    i+=3; 
                }
            }
        }
        
        return sb.toString();

    }
}