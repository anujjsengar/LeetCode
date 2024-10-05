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
    public long kthLargestLevelSum(TreeNode root, int k) {
        ArrayList<Long> li=new ArrayList<>();
        levelsum(root,li,0);
        Collections.sort(li);
        System.out.println(li);
        if(li.size()<k){
            return -1;
        }
        return li.get(li.size()-k);
    }
    public void levelsum(TreeNode root,ArrayList<Long> li,int level){
        if(root==null){
            return ;
        }
        if(li.size()==level){
            li.add((long)(0));
        }
        li.set(level,li.get(level)+root.val);
        levelsum(root.left,li,level+1);
        levelsum(root.right,li,level+1);
    }
}