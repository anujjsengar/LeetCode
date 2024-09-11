/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> li=new ArrayList<>();
        Map<TreeNode,List<TreeNode>> graph=new HashMap<>();
        GraphPath(root,null,graph);
        Set<TreeNode> visted=new HashSet<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(target);
        visted.add(target);
        while(!q.isEmpty()){
            int size=q.size();
            if(k==0){
                while(size-->0){
                    li.add(q.poll().val);
                }
                return li;
            }
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                for(TreeNode neighbour:graph.get(curr)){
                    if(!visted.contains(neighbour)){
                        visted.add(neighbour);
                        q.offer(neighbour);
                    }
                }
            }
            k--;
        }
        return li;
    }
    public void GraphPath(TreeNode node,TreeNode parent,Map<TreeNode,List<TreeNode>> graph){
        if(node==null){
            return ;
        }
        graph.putIfAbsent(node, new ArrayList<>());
        if (parent != null) {
            graph.putIfAbsent(parent, new ArrayList<>());
            graph.get(node).add(parent);
            graph.get(parent).add(node);
        }
        GraphPath(node.left,node,graph);
        GraphPath(node.right,node,graph);
    }
}