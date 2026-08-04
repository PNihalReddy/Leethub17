class Solution 
{
    public int lastStoneWeight(int[] stones) 
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int ele : stones)
        {
            pq.add(ele);
        }    

        while(pq.size()>1)
        {
            int ele1=pq.remove();
            int ele2=pq.remove();

            if(ele1!=ele2)
            {
                pq.add(Math.abs(ele1-ele2));
            }
        }

        int ans=0;

        if(pq.isEmpty())
        {
            return 0;
        }

        else
        {
            ans=pq.remove();
        }

        return ans;

    }
}