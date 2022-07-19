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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        
        if (root ==null )
            return res;
        queue.add(root);
        
        while(!queue.isEmpty())
        {
            int n = queue.size();
            for(int i = 1 ;i <=n ; i++)
            {
                TreeNode temp = queue.poll();
                if (n==i)
                    res.add(temp.val );
                
                if (temp.left!= null )
                    queue.add(temp.left);
                
                if(temp.right!= null)
                    queue.add(temp.right);
            }
        }
        return res; 
        
    }
}