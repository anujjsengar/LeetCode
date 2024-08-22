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
    public int maxLevelSum(TreeNode root) {
        if(root==null){
            return 0;
        }
        int maxsum=Integer.MIN_VALUE;
        int maxlevel=0;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int level=0;
        while(!q.isEmpty()){
            int sum=0;
            int size=q.size();
            int k=1;
            level++;
            while(k<=size){
                TreeNode curr=q.poll();
                sum=sum+curr.val;
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
                k++;
            }
            if(maxsum<sum){
                maxsum=sum;
                maxlevel=level;
            }
        }
        return maxlevel;
    }
}