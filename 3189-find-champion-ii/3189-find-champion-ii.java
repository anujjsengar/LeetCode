class Solution {
    public int findChampion(int n, int[][] edges) {
        HashMap<Integer,Integer> indegree=new HashMap<>();
        if(n==1){
            return 0;
        }
        for(int i=0;i<edges.length;i++){
            if(!indegree.containsKey(edges[i][0])){
                indegree.put(edges[i][0],0);
            }
            if(!indegree.containsKey(edges[i][1])){
                indegree.put(edges[i][1],0);
            }
            indegree.put(edges[i][1],indegree.get(edges[i][1])+1);
        }
        int total=0;
        int ele=0;
        if(indegree.size()<n){
            return -1;
        }
        for(int i:indegree.keySet()){
            if(indegree.get(i)==0){
                total++;
                ele=i;
            }
        }
        if(total==1){
            return ele;
        }
        return -1;
    }
}