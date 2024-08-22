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
    public int deepestLeavesSum(TreeNode root) {
        if(root==null){
            return 0;
        }
        Map<Integer,Integer> map=new HashMap<>();
        int max=dfs(root,1,map);
        return map.get(max);
    }
    public int dfs(TreeNode root,int level,Map<Integer,Integer> map){
        if(root==null){
            return 0;
        }
        if(map.containsKey(level)){
            map.put(level,map.get(level)+root.val);
        }
        else{
            map.put(level,root.val);
        }
        int left=dfs(root.left,level+1,map);
        int right=dfs(root.right,level+1,map);
        return Math.max(left,right)+1;
    }
}