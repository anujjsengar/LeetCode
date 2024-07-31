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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        node=root;
        List<List<Integer>> li=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        if(root==null){
            return li;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode curr=q.remove();
            if(li.size()==level(curr,node,0)){
                list.add(curr.val);
                li.add(new ArrayList(list));
                list.clear();
            }
            else{
                    li.get(level(curr,node,0)).add(curr.val);
            }
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }
        Collections.reverse(li);
        return li;       
}
public int level(TreeNode curr,TreeNode root,int label){
    if(root==null){
        return 0;
    }
    if(root==curr){
        return label;
    }
    int left=level(curr,root.left,label+1);
    if(left!=0){
        return left;
    }
    return level(curr,root.right,label+1);
}
}