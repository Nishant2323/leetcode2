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
    public int getMinimumDifference(TreeNode root) {
        List<Integer> in = new ArrayList<>();
        inorder(root,in);
        int min = Integer.MAX_VALUE;
        for(int i=0;i<in.size()-1;i++){
            min= Math.min(min,in.get(i+1)-in.get(i));
            
        }
        return min;
        
    }
    public void inorder(TreeNode root, List<Integer> ls){
        if(root == null){
            return;
        }
        inorder(root.left,ls);
        ls.add(root.val);
        inorder(root.right,ls);
    }
}