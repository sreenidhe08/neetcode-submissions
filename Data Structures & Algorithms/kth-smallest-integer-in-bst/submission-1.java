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
    public int kthSmallest(TreeNode root, int k) 
    {
        List<Integer> r = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        TreeNode cur = root;
        while(k>0 && (cur!=null||!s.isEmpty()))
        {
            while(cur!=null)
            {
                s.push(cur);
                cur=cur.left;
            }
            cur = s.pop();
            r.add(cur.val);
            cur=cur.right;
            k--;
        }
        return r.getLast();
    }
}
