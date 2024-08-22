/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    static class info {
    Node root;
    int level;

    info(Node root, int level) {
        this.root = root;
        this.level = level;
    }
}
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> li=new ArrayList<>();
        if(root==null){
            return li;
        }
        Queue<info> q=new LinkedList<>();
        q.add(new info(root,1));
        while(!q.isEmpty()){
            info curr=q.remove();
            if(li.size()<curr.level){
                li.add(new ArrayList<>());
            }
            li.get(curr.level-1).add(curr.root.val);
            for(Node child:curr.root.children){
                q.add(new info(child,curr.level+1));
            }
        }
        return li;
    }
}