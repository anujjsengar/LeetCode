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
    public void flatten(TreeNode root) {
    ArrayList<TreeNode> li=new ArrayList<>();
    flat(root,li);
    if(li.size()==0){
        return ;
    }
    root=create(li);
    }
    public void flat(TreeNode root,ArrayList<TreeNode> li){
        if(root==null){
            return;
        }
        li.add(root);
        flat(root.left,li);
        flat(root.right,li);
    }
    public TreeNode create(ArrayList<TreeNode> li){
        TreeNode root=li.get(0);
        TreeNode prev=root;
        for(int i=1;i<li.size();i++){
            root.right=li.get(i);
            root.left=null;
            root=root.right;
        }
        return prev;
    }
}