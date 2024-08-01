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
    static TreeNode node;
    public List<Double> averageOfLevels(TreeNode root) {
        node=root;
        ArrayList<Double> sum=new ArrayList();
        ArrayList<Integer> count=new ArrayList();
        Queue<TreeNode> q=new LinkedList();
        if(root==null){
            return sum;
        }
        q.add(root);
        while(!q.isEmpty()){
            TreeNode curr=q.remove();
            int label=level(node,curr,0);
            if(sum.size()==label){
                sum.add((double)curr.val);
                count.add(1);
            }
            else{
               sum.set(label,sum.get(label)+(double)curr.val);
               count.set(label,count.get(label)+1);
            }
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }
        for(int i=0;i<count.size();i++){
            sum.set(i,sum.get(i)/count.get(i));
        }
        return sum;
    }
    public int level(TreeNode root,TreeNode curr,int label){
        if(root==null){
            return 0;
        }
        if(root==curr){
            return label;
        }
        int left=level(root.left,curr,label+1);
        if(left!=0){
            return left;
        }
        return level(root.right,curr,label+1);
    }
}