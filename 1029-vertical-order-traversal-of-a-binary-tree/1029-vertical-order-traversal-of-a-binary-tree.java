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
    static class info{
        TreeNode root;
        int hd;
        int depth;
    public info(TreeNode root,int hd,int depth){
        this.root=root;
        this.hd=hd;
        this.depth=depth;
    }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Map<Integer,ArrayList<Integer>>map=new HashMap<>();
        Map<Integer,ArrayList<Integer>>map2=new HashMap<>();
        List<List<Integer>> list=new ArrayList<>();
        ArrayList<Integer> li=new ArrayList<>();
        if(root==null){
            return list;
        }
        Queue<info> q=new LinkedList<>();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        q.add(new info(root,0,0));
        while(!q.isEmpty()){
            info curr=q.poll();
            map.putIfAbsent(curr.hd, new ArrayList<>());
            map2.putIfAbsent(curr.hd, new ArrayList<>());
            map.get(curr.hd).add(curr.root.val);
            map2.get(curr.hd).add(curr.depth);
            if(Collections.frequency(map2.get(curr.hd),curr.depth)>1){
                sorting(map.get(curr.hd),Collections.frequency(map2.get(curr.hd),curr.depth));
            }
            min=Math.min(min,curr.hd);
            max=Math.max(max,curr.hd);
            if(curr.root.left!=null){
                q.add(new info(curr.root.left,curr.hd-1,curr.depth+1));
                
            }
            if(curr.root.right!=null){
                q.add(new info(curr.root.right,curr.hd+1,curr.depth+1));
            }
            }
            for(int i=min;i<=max;i++){
                list.add(map.get(i));
            }
            return list;
        }
        public void sorting(ArrayList<Integer> li,int n) {
        if (li.size() <= 2) {
            Collections.sort(li);
            return;
        }

        List<Integer> lastTwoElements = new ArrayList<>(li.subList(li.size()-n, li.size()));
        List<Integer> restOfList = new ArrayList<>(li.subList(0, li.size() - n));
        Collections.sort(lastTwoElements);
        li.clear();
        li.addAll(restOfList);
        li.addAll(lastTwoElements);
    }
    }
