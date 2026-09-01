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
    public int countNodes(TreeNode root) 
    {
        if(root==null)
        {
            return 0;
        }

        int lc=0,rc=0;

        TreeNode t = root;

        while(t!=null)
        {
            lc++;
            t=t.left;
        }

        t=root;

        while(t!=null)
        {
            rc++;
            t=t.right;
        }

        if(lc==rc)
        {
            return (1 << lc) -1;
        }

        else
        {
            return 1 + countNodes(root.left) + countNodes(root.right);
        }
    }
}