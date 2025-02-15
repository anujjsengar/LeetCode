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
        dfs(root1,root2,li);
        Collections.sort(li);
        return li;
    }
    public void dfs(TreeNode root1,TreeNode root2,List<Integer> li){
        if(root1==null && root2==null){
            return ;
        }
        if(root1==null){
            li.add(root2.val);
            dfs(root1,root2.left,li);
            dfs(root1,root2.right,li);
        }
        if(root2==null){
            li.add(root1.val);
            dfs(root1.left,root2,li);
            dfs(root1.right,root2,li);
        }
        if(root1!=null && root2!=null){
            li.add(root1.val);
            li.add(root2.val);
            dfs(root1.left,root2.left,li);
            dfs(root1.right,root2.right,li);
        }
    }
}