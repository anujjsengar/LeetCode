class Solution {
    int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return diameter;
    }
    public int depth(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=depth(root.left);
        int right=depth(root.right);
        diameter=Math.max(left+right,diameter);
        return 1+Math.max(left,right);
    }
}