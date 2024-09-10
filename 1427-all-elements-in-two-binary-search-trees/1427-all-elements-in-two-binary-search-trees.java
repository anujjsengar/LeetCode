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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> li=new ArrayList<>();
        dfs(root1,li);
        dfs(root2,li);
        Collections.sort(li);
        return li;
    }
    public void dfs(TreeNode root,List<Integer> li){
        if(root==null){
            return ;
        }
        dfs(root.left,li);
        li.add(root.val);
        dfs(root.right,li);
    }
}