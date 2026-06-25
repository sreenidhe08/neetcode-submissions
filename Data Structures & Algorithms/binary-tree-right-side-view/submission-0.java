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

class Solution {
    public List<Integer> rightSideView(TreeNode root) 
    {
        List<Integer> res = new ArrayList<>();
        Deque<TreeNode> q = new ArrayDeque<>();
        if(root==null) return res;
        q.offer(root);
        while(!q.isEmpty())
        {
            int s = q.size();
            int t=0;
            while(t<s)
            {
                TreeNode temp = q.poll();
                if(t==s-1)
                {
                res.add(temp.val);
                }
                if(temp.left!=null) q.offer(temp.left);
                if(temp.right!=null) q.offer(temp.right);
                t++;
            }
        }
       return res; 
    }
}
