class Solution 
{
    public List<Integer> findWordsContaining(String[] words, char x) 
    {
        List<Integer> ans = new ArrayList<>();
        int i;

        for(i=0;i<words.length;i++)
        {
            if(words[i].indexOf(x)!=-1)
            {
                ans.add(i);
            }
        }

        return ans;
        
    }
}