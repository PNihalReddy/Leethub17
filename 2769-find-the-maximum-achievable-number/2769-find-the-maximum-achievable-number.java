class Solution 
{
    public int theMaximumAchievableX(int num, int t) 
    {
        int max_ops = 2*t;
        int ans = num+max_ops;
        return ans;
    }
}