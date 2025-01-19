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
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> map=new HashSet<>();
        return find(root,k,map);
    }
    public boolean find(TreeNode root,int k,HashSet<Integer> map){
        if(root==null){
            return false;
        }
        if(map.contains(k-root.val)){
            return true;
        }
        map.add(root.val);
        return find(root.left,k,map) || find(root.right,k,map);
    }
}