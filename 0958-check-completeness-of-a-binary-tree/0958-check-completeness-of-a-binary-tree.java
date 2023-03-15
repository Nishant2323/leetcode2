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
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        boolean end = false;
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode node = q.remove();
            if(node == null){
                end=true;
            }
            else{
                if(end)return false;
                q.offer(node.left);
                q.offer(node.right);
            }
            
        }
        return true;
    }
}