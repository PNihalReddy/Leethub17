class MedianFinder 
{
    private PriorityQueue<Integer> s;
    private PriorityQueue<Integer> l;

    public MedianFinder() 
    {
        s = new PriorityQueue<>(Collections.reverseOrder());
        l = new PriorityQueue<>();

    }
    
    public void addNum(int num) 
    {
        s.add(num);
        l.add(s.remove());

        if(l.size()>s.size())
        {
            s.add(l.remove());
        }
    }
    
    public double findMedian() 
    {
        if(s.size()>l.size())
        {
            int x = s.peek();
            return x;
        }

        double ans = (s.peek()+l.peek())/2.0;
        return ans;

    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */