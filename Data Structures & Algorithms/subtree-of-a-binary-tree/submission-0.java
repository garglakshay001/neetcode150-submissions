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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

            if (root == null){
            return false; 
            }
            if(isSame(root, subRoot)){
                return true;
            }
            return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
        public boolean isSame(TreeNode t, TreeNode s){

            if(t == null && s == null){
                return true;
            }
            if(t == null || s == null || t.val != s.val){
                return false;
            }
            return isSame(t.left, s.left) && isSame(t.right, s.right);
        }    
}
