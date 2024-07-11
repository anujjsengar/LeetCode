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
    static int sum=0;
    public int sumOfLeftLeaves(TreeNode root) {
        sum=0;
        leaf(root);
        return sum;
    }
    public void leaf(TreeNode root){
        if(root==null){
            return ;
        }
        if(root.left!=null && root.left.right==null && root.left.left==null){
            sum+=root.left.val;
        }
        leaf(root.left);
        leaf(root.right);
    }
}