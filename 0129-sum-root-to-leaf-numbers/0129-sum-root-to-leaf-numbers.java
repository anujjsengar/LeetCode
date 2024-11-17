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
    int result=0;
    public int sumNumbers(TreeNode root) {
        sum(root,0);
        return result;
    }
    public void sum(TreeNode root,int ans){
        if(root==null){
            return ;
        }
        if(root.left==null && root.right==null){
            ans=ans*10+root.val;
            result=result+ans;
        }
        sum(root.left,ans*10+root.val);
        sum(root.right,ans*10+root.val);
    }
}