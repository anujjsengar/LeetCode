class Solution {
    public int longestCycle(int[] edges) {
        int indegree[]=new int[edges.length];
        for(int i=0;i<edges.length;i++){
            if(edges[i]!=-1){
                indegree[edges[i]]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<edges.length;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        boolean [] visited=new boolean[edges.length];
        while(!q.isEmpty()){
            int curr=q.poll();
            visited[curr]=true;
            if(edges[curr]!=-1){
                indegree[edges[curr]]--;
                if(indegree[edges[curr]]==0){
                    q.add(edges[curr]);
                }
            }
        }
        int count=-1;
        for(int i=0;i<edges.length;i++){
            if(visited[i]==false){
                visited[i]=true;
                int neigh=edges[i];
                int counter=1;
                while(neigh!=i){
                    visited[neigh]=true;
                    counter++;
                    neigh=edges[neigh];
                }
                count=Math.max(count,counter);
            }
        }
        return count;
    }
}