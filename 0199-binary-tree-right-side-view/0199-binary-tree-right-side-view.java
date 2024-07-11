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
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> li=new ArrayList<>();
        view(root,li,0);
        return li;
    }
    public void view(TreeNode root,ArrayList<Integer> li,int label){
        if(root==null){
            return ;
        }
        if(li.size()==label){
            li.add(root.val);
        }
        view(root.right,li,label+1);
        view(root.left,li,label+1);
    }
}