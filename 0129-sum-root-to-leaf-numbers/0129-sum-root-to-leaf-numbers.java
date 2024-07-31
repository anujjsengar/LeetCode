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
    static int max=0;
    public int sumNumbers(TreeNode root) {
        max=0;
        solve(root,"");
        return max;
    }
    public void solve(TreeNode root,String sum){
        if(root==null){
            return ;
        }
        sum+=root.val;
        if(root.left==null && root.right==null){
            max=max+Integer.parseInt(sum);
            return; 
        }
        solve(root.left,sum);
        solve(root.right,sum);
    }
}