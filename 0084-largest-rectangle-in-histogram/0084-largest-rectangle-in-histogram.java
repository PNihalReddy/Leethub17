class Solution 
{
    public int largestRectangleArea(int[] heights) 
    {
        Stack<Integer> stk = new Stack<>();
        int i,max_area=0;
        int n = heights.length;

        for(i=0;i<=n;i++)
        {
            int height = 0;

            if(i<n)
            {
                height = heights[i];
            }

            while(!stk.isEmpty() && height<heights[stk.peek()])
            {
                int h = heights[stk.pop()];
                int w;

                if(stk.isEmpty())
                {
                    w=i;
                }

                else
                {
                    w = i-stk.peek()-1;
                }

                max_area = Math.max(max_area,h*w);

            }

            stk.push(i);

        }

        return max_area;

    }
}