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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> li=new ArrayList<>();
        dfs(root,li,0);
        return li;
    }
    public void dfs(TreeNode root,List<List<Integer>> li,int level){
        if(root==null){
            return ;
        }
        if(li.size()==level){
            li.add(new ArrayList<>());
        }
        if(level%2==0){
            li.get(level).add(root.val);
        }
        else{
            if(li.get(level).size()==0){
                li.get(level).add(root.val);
            }
            else{
                li.get(level).add(0,root.val);
            }
        }
        dfs(root.left,li,level+1);
        dfs(root.right,li,level+1);
    }
}