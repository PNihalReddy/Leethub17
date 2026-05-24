public class LC1 
{
    public int[] limitOccurrences(int[] nums, int k) 
    {
        int r_i=0,w_i=0;

        for(r_i=0;r_i<nums.length;r_i++)
        {
            if(w_i<k || nums[r_i]!=nums[w_i-k])
            {
                nums[w_i]=nums[r_i];
                w_i++;
            }
        }

        int res[] = new int[w_i];
        int i;

        for(i=0;i<w_i;i++)
        {
            res[i]=nums[i];
        }

        return res;
        
    }
}