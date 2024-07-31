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
    static int ans=0;
    public int sumRootToLeaf(TreeNode root) {
        ans=0;
        sum(root,"");
        return ans;
    }

    private void sum(TreeNode root, String s) {
        if (root == null) {
            return;
        }
        s += root.val;
        if (root.left == null && root.right == null) {
            ans += Integer.parseInt(s, 2);;
            return;
        }
        sum(root.left, s);
        sum(root.right, s);
    }
}