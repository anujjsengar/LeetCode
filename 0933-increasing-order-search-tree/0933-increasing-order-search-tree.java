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
    public TreeNode increasingBST(TreeNode root) {
        ArrayList<Integer> li=new ArrayList<>();
        if(root==null){
            return root;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode curr=q.poll();
            li.add(curr.val);
            if(curr.left!=null){
                q.add((curr.left));
            }
            if(curr.right!=null){
                q.add((curr.right));
            }
        }
        Collections.sort(li);
        TreeNode tree=new TreeNode(li.get(0));
        root=tree;
        int i=1;
        while(li.size()>i){
            root.right=new TreeNode(li.get(i));
            i++;
            root=root.right;
        }
        return tree;
    }
}