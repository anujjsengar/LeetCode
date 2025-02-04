class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        HashSet<Integer> visited=new HashSet<>();
        Queue<Integer> pq=new LinkedList<>();
        pq.add(0);
        while(!pq.isEmpty()){
            int curr=pq.poll();
            if(visited.contains(curr)){
                continue;
            }
            visited.add(curr);
            for(int i=0;i<rooms.get(curr).size();i++){
                if(!visited.contains(rooms.get(curr).get(i))){
                    pq.add(rooms.get(curr).get(i));
                }
            }
        }
        return visited.size()==rooms.size();
    }
}