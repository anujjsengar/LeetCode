class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<Integer> li=new ArrayList<>();
        List<List<Integer>> list=new ArrayList<>();
        HashSet<Integer> visited=new HashSet<>();
        li.add(0);
        path(graph,0,graph.length-1,li,list,visited);
        return list;
    }
    public void path(int[][] graph,int source,int des,List<Integer> li,List<List<Integer>> list,HashSet<Integer> visited){
        if(source==des){
            list.add(new ArrayList<>(li));
            return ;
        }
        if(visited.contains(source)){
            return ;
        }
        visited.add(source);
        for(int neigh:graph[source]){
            if(!visited.contains(neigh)){
                li.add(neigh);
                path(graph,neigh,des,li,list,visited);
                li.remove(li.size()-1);
            }
        }
        visited.remove(source);
    }
}