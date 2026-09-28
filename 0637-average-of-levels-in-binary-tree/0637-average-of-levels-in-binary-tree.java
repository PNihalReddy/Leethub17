/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution 
{
    public List<Double> averageOfLevels(TreeNode root) 
    {
        List<Double> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty())
        {
            int levelsize = q.size();
            double s1=0;
            int i;

            for(i=0;i<levelsize;i++)
            {
                TreeNode node = q.remove();
                s1+=node.val;

                if(node.left!=null)
                {
                    q.add(node.left);
                }

                if(node.right!=null)
                {
                    q.add(node.right);
                }
            }

            ans.add(s1/levelsize);

        }

        return ans;
        
    }
}