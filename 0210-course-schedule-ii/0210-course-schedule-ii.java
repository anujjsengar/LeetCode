class Solution {
    public int[] findOrder(int numCourses, int[][] course) {
        HashMap<Integer,HashSet<Integer>> graph=new HashMap<>();
        for(int i=0;i<numCourses;i++){
            graph.put(i,new HashSet<>());
        }
        int[] indegree=new int[numCourses];
        int[] ans=new int[numCourses];
        for(int i=0;i<course.length;i++){
            graph.get(course[i][1]).add(course[i][0]);
            indegree[course[i][0]]++;
        }
        int index=0;
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                q.add(i);
                // ans[index]=i;
                // index++;
            }
        }
        int count=0;
        while(!q.isEmpty()){
            int curr=q.poll();
            ans[index]=curr;
            index++;
            count++;
            for(int neigh:graph.get(curr)){
                indegree[neigh]--;
                if(indegree[neigh]==0){
                    q.add(neigh);
                }
            }
        }
        if(count==numCourses)
        return ans;
        return new int[0];
    }
}