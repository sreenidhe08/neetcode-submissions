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
    HashMap<Integer, Integer> map = new HashMap<>();
    int[] preorder;
    public TreeNode buildTree(int[] preorder, int[] inorder) 
    {
        this.preorder = preorder;
        //HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        {
            map.put(inorder[i],i);
        }
        return build(0, 0, inorder.length - 1);
    }
    public TreeNode build(int prestart,int instart,int inend)
    {
        if(instart>inend)
        {
            return null;
        }
        int root = preorder[prestart];
        TreeNode t = new TreeNode(root);
        int idx = map.get(root);
        int l= idx-instart;
        t.left=build(prestart+1,instart,idx-1);
        t.right=build(prestart+l+1,idx+1,inend);
        return t;
    }
}
