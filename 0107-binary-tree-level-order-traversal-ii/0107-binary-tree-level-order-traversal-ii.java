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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>>  li=new ArrayList<>();
        dfs(root,li,0);
        return li;
    }
    public void dfs(TreeNode root,List<List<Integer>> li,int level){
        if(root==null){
            return ;
        }
        if(li.size()==level){
            if(li.size()==0){
                li.add(new ArrayList<>());
            }
            else{
                li.add(0,new ArrayList<>());
            }
        }
        li.get((li.size()-1)-level).add(root.val);
        dfs(root.left,li,level+1);
        dfs(root.right,li,level+1);
    }
}