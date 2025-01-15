class Solution {
    public class Node{
        int vtx;
        int dis;
        Node(int val,int dis){
            this.vtx=val;
            this.dis=dis;
        }
    }
    public boolean isBipartite(int[][] graph) {
        Queue<Node> q=new LinkedList<>();
        HashMap<Integer,Integer> visited=new HashMap<>();
        for(int i=0;i<graph.length;i++){
            if(visited.containsKey(i)){
                continue;
            }
            q.add(new Node(i,0));
            //visited.put(i,0);
            while(!q.isEmpty()){
                Node curr=q.poll();
                if(visited.containsKey(curr.vtx)){
                    if(map.get(curr.vtx)!=curr.dis){
                        return false;
                    }
                    continue;
                }
                visited.put(curr.vtx,curr.dis);
                for(int j:graph[curr.vtx]){
                    q.add(new Node(j,curr.dis+1));
                }
            }
        }
        return true;
    }
}