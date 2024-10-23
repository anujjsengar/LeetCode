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
    public TreeNode replaceValueInTree(TreeNode root) {
        HashMap<Integer,Integer> map=new HashMap<>();
        if(root==null){
            return root;
        }
        dfs(root,0,map);
        solve(root,root.val,map,0);
        System.out.println(map);
        return root;
    }
    public void solve(TreeNode root,int childSum,Map<Integer,Integer> map,int h){
        if(root==null){
            return ;
        }
        root.val=map.get(h)-childSum;
        childSum=0;
        if(root.left!=null){
            childSum=childSum+root.left.val;
        }
        if(root.right!=null){
            childSum=childSum+root.right.val;
        }
        solve(root.left,childSum,map,h+1);
        solve(root.right,childSum,map,h+1);
    }
    public void dfs(TreeNode root,int h,Map<Integer,Integer> map){
        if(root==null){
            return ;
        }
        if(!map.containsKey(h)){
            map.put(h,0);
        }
        map.put(h,map.get(h)+root.val);
        dfs(root.left,h+1,map);
        dfs(root.right,h+1,map);
    }
}