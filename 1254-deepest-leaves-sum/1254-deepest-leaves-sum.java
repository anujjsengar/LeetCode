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
    static int depth=0;
    static int ans=0;
    public int deepestLeavesSum(TreeNode root) {
        depth=0;
        ans=0;
        if(root==null){
            return 0;
        }
        sum(root,1);
        return ans;
    }
    public void sum(TreeNode root,int dp){
        if(root==null){
            return ;
        }
        if(dp>depth){
            depth=dp;
            ans=root.val;
        }
        else if(dp==depth){
            ans=ans+root.val;
        }
        sum(root.left,dp+1);
        sum(root.right,dp+1);
    }
}