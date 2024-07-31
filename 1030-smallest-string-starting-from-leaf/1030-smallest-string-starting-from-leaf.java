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
    static String s;
    public String smallestFromLeaf(TreeNode root) {
        s="";
        small(root,"");
        return s;
    }
    public void small(TreeNode root,String str){
        if(root==null){
            return ;
        }
        str=(char) (root.val + 97)+str;
        if(root.left==null && root.right==null){
            if(s.equals("") || s.compareTo(str)>0){
                s=str;
            }
        }
        small(root.left,str);
        small(root.right,str);
    }

}