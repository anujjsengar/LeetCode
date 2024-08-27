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
    static int result=0;
    public int sumNumbers(TreeNode root) {
        result=0;
        dfs(root,0);
        return result;
    }
    public void dfs(TreeNode root,int sum){
        if(root==null){
            return ;
        }
        sum=sum*10+root.val;
        if(root.left==null && root.right==null){
            result=result+sum;
        }
        dfs(root.left,sum);
        dfs(root.right,sum);
        sum=sum/10;
    }
}