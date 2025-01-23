class Solution {
    public boolean canFinish(int numCourses, int[][] course) {
        HashMap<Integer,HashSet<Integer>> graph=new HashMap<>();
        for(int i=0;i<numCourses;i++){
            graph.put(i,new HashSet<>());
        }
        int[] indegree=new int[numCourses];
        for(int i=0;i<course.length;i++){
            graph.get(course[i][1]).add(course[i][0]);
            indegree[course[i][0]]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        int count=0;
        while(!q.isEmpty()){
            int curr=q.poll();
            count++;
            for(int neigh:graph.get(curr)){
                indegree[neigh]--;
                if(indegree[neigh]==0){
                    q.add(neigh);
                }
            }
        }
        return count==numCourses;
    }
}