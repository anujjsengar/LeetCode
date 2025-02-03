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
    static boolean flag=true;
    public boolean isBalanced(TreeNode root) {
        flag=true;
        check(root);
        return flag;
    }
    public int check(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=check(root.left);
        int right=check(root.right);
        if(Math.abs(left-right)>1){
            flag=false;
        }
        return Math.max(left,right)+1;
    }
}