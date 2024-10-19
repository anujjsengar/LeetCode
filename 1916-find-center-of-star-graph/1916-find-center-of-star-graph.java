class Solution {
    public int findCenter(int[][] edges) {
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
        for(int i:map.keySet()){
            if(map.get(i).size()==map.size()-1){
                return i;
            }
        }
        return -1;
    }
}