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
    public int findBottomLeftValue(TreeNode root) {
        Map<Integer,Integer> map=new HashMap<>();
        int pos=find(root,map,1);
        return map.get(pos);
    }
    public int find(TreeNode root,Map<Integer,Integer> map,int level){
        if(root==null){
            return 0;
        }
        if(!map.containsKey(level)){
            map.put(level,root.val);
        }
        int left=find(root.left,map,level+1);
        int right=find(root.right,map,level+1);
        return Math.max(left,right)+1;
    }
}