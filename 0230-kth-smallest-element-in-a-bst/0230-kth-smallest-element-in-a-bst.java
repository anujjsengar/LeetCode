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
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> li=new ArrayList<>();
        small(root,li);
        Collections.sort(li);
        return li.get(k-1);
    }
    public void small(TreeNode root,ArrayList<Integer> li){
        if(root==null){
            return ;
        }
        li.add(root.val);
        small(root.left,li);
        small(root.right,li);
    }
}