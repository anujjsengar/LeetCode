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
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> li=new ArrayList<>();
        if(root==null){
            return li;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            int k=1;
            List<Integer> list=new ArrayList<>();
            while(k<=size){
                Node curr=q.remove();
                list.add(curr.val);
                for(Node child : curr.children){
                    q.add(child);
                }
                k++;
            }
            li.add(list);
        }
        return li;
    }
}