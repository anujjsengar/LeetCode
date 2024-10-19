class Solution {
    public int findJudge(int n, int[][] trust) {
        HashMap<Integer,HashSet<Integer>> graph=new HashMap<>();
        if(trust.length==0 && n==1){
            return 1;
        }
        for(int i=0;i<trust.length;i++){
            if(!graph.containsKey(trust[i][0])){
                graph.put(trust[i][0],new HashSet<>());
            }
            if(!graph.containsKey(trust[i][1])){
                graph.put(trust[i][1],new HashSet<>());
            }
            graph.get(trust[i][0]).add(trust[i][1]);
        }
        int judge=-1;
        for(int i:graph.keySet()){
            if(graph.get(i).size()==0){
                judge=i;
            }
        }
        for(int i:graph.keySet()){
            if(i!=judge){
                if(!graph.get(i).contains(judge)){
                    return -1;
                }
            }
        }
        return judge;
    }
}