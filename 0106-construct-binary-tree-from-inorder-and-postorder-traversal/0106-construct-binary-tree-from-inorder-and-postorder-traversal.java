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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return create(inorder,postorder,0,inorder.length-1,0,postorder.length-1,map);
    }
    public TreeNode create(int inorder[],int[] postorder,int instart,int inend,int poststart,int postend,Map<Integer,Integer>map){
        if(instart>inend || poststart>postend){
            return null;
        }
        TreeNode root=new TreeNode(postorder[postend]);
        int index=map.get(postorder[postend]);
        int left_size=index-instart;
        root.left=create(inorder,postorder,instart,index-1,poststart,poststart+left_size-1,map);
        root.right=create(inorder,postorder,index+1,inend,poststart+left_size,postend-1,map);
        return root;
    }
}