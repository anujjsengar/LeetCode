class Solution {
    public class Node{
        int vtx;
        int cost;
        Node(int vtx,int cost){
            this.vtx=vtx;
            this.cost=cost;
        }
    }
    public int networkDelayTime(int[][] times, int n, int k) {
        HashMap<Integer,HashMap<Integer,Integer>> graph=new HashMap<>();
        for(int[] edge:times){
            if(!graph.containsKey(edge[0])){
                graph.put(edge[0],new HashMap<>());
            }
            graph.get(edge[0]).put(edge[1],edge[2]);
            if(!graph.containsKey(edge[1])){
                graph.put(edge[1],new HashMap<>());
            }
        }
        PriorityQueue<Node> pq=new PriorityQueue<>(new Comparator<Node>(){
            @Override
            public int compare(Node a,Node b){
                return a.cost-b.cost;
            }
        });
        HashSet<Integer> visited=new HashSet<>();
        int ans=0;
        pq.add(new Node(k,0));
        while(!pq.isEmpty()){
            Node curr=pq.poll();
            if(visited.contains(curr.vtx)){
                continue;
            }
            ans=Math.max(ans,curr.cost);
            visited.add(curr.vtx);
            for(int neigh:graph.get(curr.vtx).keySet()){
                if(!visited.contains(neigh)){
                    pq.add(new Node(neigh,curr.cost+graph.get(curr.vtx).get(neigh)));
                }
            }
        }
        return visited.size()==n?ans:-1;
    }
}