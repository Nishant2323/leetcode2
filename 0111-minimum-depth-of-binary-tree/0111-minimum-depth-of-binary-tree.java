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
    int max = Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
//         if(root == null) return 0;
//         int left = minDepth(root.left);
//         int right = minDepth(root.right);
        
//         return Math.min(left,right)+1;
        cou(root,1);
            return max;
    }
    public void cou(TreeNode root,int count){
        if(root.left==null&& root.right==null){
            max = Math.min(count,max);
        }
        if(root.left!=null)cou(root.left,count+1);
        if(root.right!=null)cou(root.right,count+1);
    }
}