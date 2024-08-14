/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    static class info{
        Node root;
        int level;
        public info(){
            this.root=null;
            this.level=0;
        }
        public info(Node root,int level){
            this.root=root;
            this.level=level;
        }
    }
    public Node connect(Node root) {
        if(root==null){
            return null;
        }
        Queue<info> q=new LinkedList<>();
        info prev=new info();
        q.add(new info(root,0));
        while(!q.isEmpty()){
            info curr=q.poll();
            if(prev.root!=null && prev.level==curr.level){
                prev.root.next=curr.root;
            }
            prev=curr;
            if(curr.root.left!=null){
                q.add(new info(curr.root.left,curr.level+1));
            }
            if(curr.root.right!=null){
                q.add(new info(curr.root.right,curr.level+1));
            }
        }
        return root;
    }
}