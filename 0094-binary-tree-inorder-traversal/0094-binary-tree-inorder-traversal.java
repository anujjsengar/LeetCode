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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> li=new ArrayList<>();
        find(root,li);
        return li;
    }
    public void find(TreeNode root,ArrayList<Integer> li){
        if(root==null){
            return ;
        }
        find(root.left,li);
        li.add(root.val);
        find(root.right,li);
    }
}