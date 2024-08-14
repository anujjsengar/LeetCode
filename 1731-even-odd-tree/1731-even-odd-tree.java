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
    public boolean isEvenOddTree(TreeNode root) {
        Map<Integer,Integer> map=new HashMap<>();
        return EvenOdd(root,0,map);
    }
    public boolean EvenOdd(TreeNode root,int level,Map<Integer,Integer> map){
        if(root==null){
            return true;
        }
        if(level%2==0){
            if(root.val%2==0)
            return false;
            if(map.containsKey(level) && map.get(level)>=root.val){
                return false;
            }
        }
        if(level%2!=0){
            if(root.val%2!=0)
            return false;
            if(map.containsKey(level) && map.get(level)<=root.val){
                return false;
            }
        }
        map.put(level,root.val);
        return EvenOdd(root.left,level+1,map) && EvenOdd(root.right,level+1,map);
    }
    
}