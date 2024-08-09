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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums.length==0){
            return null;
        }
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[index]){
                index=i;
            }
        }
        TreeNode root=new TreeNode(nums[index]);
        root.left=constructMaximumBinaryTree(Arrays.copyOfRange(nums, 0, index));
        root.right=constructMaximumBinaryTree(Arrays.copyOfRange(nums,index+1,nums.length));
        return root;
    }
}