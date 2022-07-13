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
    public boolean isBalanced(TreeNode root) {
        int lh ; 
        int rh; 
        if(root ==null )
            return true;
        lh = height(root.left);
        rh = height(root.right);
        if (Math.abs(lh-rh)<= 1 && isBalanced(root.left) && isBalanced(root.right))
            return true ; 
        
        return false ;
    }
    
    int height (TreeNode node )
    {
        if (node == null )
            return 0 ;
        return 1+Math.max(height(node.left), height(node.right));
    }
}