class Solution {
    public int findCircleNum(int[][] isConnected) {
        HashSet<Integer> visited=new HashSet<>();
        int count=0;
        for(int i=0;i<isConnected.length;i++){
            if(visited.contains(i)){
                continue;
            }
            count++;
            Queue<Integer> q=new LinkedList<>();
            q.add(i);
            while(!q.isEmpty()){
                int curr=q.poll();
                if(visited.contains(curr)){
                    continue;
                }
                visited.add(curr);
                for(int j=0;j<isConnected.length;j++){
                    if(j!=curr && isConnected[curr][j]==1 && !visited.contains(j)){
                        q.add(j);
                    }
                }
            }
        }
        return count;
    }
}