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
       return height(root) != -1; 
       //If height(root) != -1, it means the tree is balanced, so isBalanced() returns true.
//If height(root) == -1, it means the tree is not balanced, so isBalanced() returns false.

//balance tree k liye left height and right height ka diff 1 se jayada nhi hona chaiye
        
    }
    private int height(TreeNode root){
        if(root == null){
            return 0;
        }
        int lh=height(root.left);
        if(lh ==-1) return -1;
        int rh=height(root.right);
        if(rh==-1)  return -1;
        if(Math.abs(lh-rh)>1) return -1;
        return Math.max(lh,rh)+1;
    }
}