class Solution 
{
    public List<Integer> stableMountains(int[] height, int threshold) 
    {
        List<Integer> ans = new ArrayList<>();
        int i,n=height.length;

        for(i=1;i<n;i++)
        {
            if(height[i-1]>threshold)
                ans.add(i);
        } 

        return ans;
        
    }
}