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
        if(root==null){
            return flag;
        }
        //System.out.println(height(root));
        /*int left=height(root.left);
        int right=height(root.right);
        System.out.println(Math.abs(left-right));
        /*if(Math.abs(left-right)>1){
            
            return false;
        }*/
        height(root);
        return flag;
    }
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=height(root.left);
        int right=height(root.right);
        if(Math.abs(left-right)>1){
            flag=false;
        }
        return Math.max(left,right)+1;
    }
}