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
    public List<Integer> postorder(Node root) {
        List<Integer> li=new ArrayList<>();
        dfs(root,li);
        return li;
    }
    public void dfs(Node root,List<Integer> li){
        if(root==null){
            return ;
        }
        for(Node child:root.children){
            dfs(child,li);
        }
        li.add(root.val);
    }
}