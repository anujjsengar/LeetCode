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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1){
            TreeNode parents=new TreeNode(val);
            parents.left=root;
            return parents;
        }
        height(root,val,depth,1);
        return root;
    }
    public void height(TreeNode root,int val,int depth,int level){
        if(root==null){
            return ;
        }
        if(depth==level+1){
            TreeNode temp=root.left;
            root.left=new TreeNode(val);
            root.left.left=temp;
            temp=root.right;
            root.right=new TreeNode(val);
            root.right.right=temp;
        }
        height(root.left,val,depth,level+1);
        height(root.right,val,depth,level+1);
    }
}