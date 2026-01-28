class Solution 
{
    public boolean checkIfExist(int[] arr) 
    {
        int i,j;

        for(i=0;i<arr.length-1;i++)
        {
            for(j=i+1;j<arr.length;j++)
            {
                if(arr[j]==2*arr[i] || arr[i]==2*arr[j])
                {
                    return true;
                }
            }
        }    
        
        return false;

    }
}