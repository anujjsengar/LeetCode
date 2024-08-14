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
    static class info{
        TreeNode root;
        int level;
        public info(TreeNode root,int level){
            this.root=root;
            this.level=level;
        }
    }
    public List<Integer> largestValues(TreeNode root) {
        ArrayList<Integer> li=new ArrayList<>();
        large(root,0,li);
        return li;
    }
    public void large(TreeNode root,int depth,ArrayList<Integer> li){
        if(root==null){
            return ;
        }
        if(li.size()==depth){
            li.add(root.val);
        }
        else{
            if(li.get(depth)<root.val){
                li.set(depth,root.val);
            }
        }
        large(root.left,depth+1,li);
        large(root.right,depth+1,li);
    }
}