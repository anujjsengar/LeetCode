class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        HashMap<Integer,HashSet<Integer>> map=new HashMap<>();
        for(int i=0;i<edges.length;i++){
            if(!map.containsKey(edges[i][0])){
                map.put(edges[i][0],new HashSet<>());
            }
            if(!map.containsKey(edges[i][1])){
                map.put(edges[i][1],new HashSet<>());
            }
            map.get(edges[i][0]).add(edges[i][1]);
            map.get(edges[i][1]).add(edges[i][0]);
        }
        if(map.size()==0){
            return true;
        }
        return Path(map,source,destination,new HashSet<>());
    }
    public boolean Path(HashMap<Integer,HashSet<Integer>> graph,int source,int dest,Set<Integer> visited){
        if(graph.get(source).contains(dest)){
            return true;
        }
        visited.add(source);
        for(int sor:graph.get(source)){
            if(!visited.contains(sor) && Path(graph,sor,dest,visited)){
                return true;
            }
        }
        return false;
    }
}