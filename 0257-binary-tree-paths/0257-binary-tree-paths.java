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
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> li=new ArrayList<>();
        path(root,li,"");
        return li;
    }
    public void path(TreeNode root,ArrayList<String> li,String ans){
        if(root==null){
            //li.add(ans);
            return ;
        }
        if(root.left==null && root.right==null){
            ans=ans+root.val;
            li.add(ans);
            return ;
        }
        path(root.left,li,ans+root.val+"->");
        path(root.right,li,ans+root.val+"->");
    }
}