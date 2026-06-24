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
    public boolean issame(TreeNode root,TreeNode subroot)
    {
        if(root==null && subroot==null) return true;
        if(root==null || subroot==null) return false;
            if(root.val!=subroot.val)
            return false;
        return issame(root.left,subroot.left) &&
            issame(root.right,subroot.right);
        
    }  
    public boolean isSubtree(TreeNode root, TreeNode subRoot) 
    {
        if(root==null) return false;
        Stack<TreeNode> s = new Stack<>();
        s.push(root);
        while(!s.isEmpty())
        {
            TreeNode temp = s.pop();
            if(temp.val==subRoot.val && issame(temp,subRoot))
            return true;
            
            if(temp.right!=null) s.push(temp.right);
            if(temp.left!=null) s.push(temp.left);
        }
        return false;
    }
}
