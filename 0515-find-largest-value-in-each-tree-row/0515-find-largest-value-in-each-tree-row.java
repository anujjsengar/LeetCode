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
        if(root==null){
            return li;
        }
        Queue<info> q=new LinkedList<>();
        q.add(new info(root,0));
        while(!q.isEmpty()){
            info curr=q.poll();
            if(li.size()==curr.level){
                li.add(curr.root.val);
            }
            else{
                if(li.get(curr.level)<curr.root.val){
                    li.set(curr.level,curr.root.val);
                }
            }
            if(curr.root.left!=null){
                q.add(new info(curr.root.left,curr.level+1));
            }
            if(curr.root.right!=null){
                q.add(new info(curr.root.right,curr.level+1));
            }
        }
        return li;
    }
}