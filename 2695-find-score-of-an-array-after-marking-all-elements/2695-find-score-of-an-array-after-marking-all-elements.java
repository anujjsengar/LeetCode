class Solution {
    public class Node implements Comparable<Node> {
        int score;
        int index;
        public Node(int score,int index){
            this.score=score;
            this.index=index;
        }
        @Override
        public int compareTo(Node b){
            if(this.score==b.score){
                return this.index-b.index;
            }
            return this.score-b.score;
        }
    }
    public long findScore(int[] nums) {
        PriorityQueue<Node> pq=new PriorityQueue<>();
        boolean[] bool=new boolean[nums.length];
        for(int i=0;i<nums.length;i++){
            pq.add(new Node(nums[i],i));
        }
        int count=nums.length;
        long ans=0;
        while(count>0){
            Node curr=pq.poll();
            if(!bool[curr.index]){
                ans=ans+curr.score;
                bool[curr.index]=true;
                count--;
                if(curr.index-1>=0 && !bool[curr.index-1]){
                    bool[curr.index-1]=true;
                    count--;
                }
                if(curr.index+1<nums.length && !bool[curr.index+1]){
                    bool[curr.index+1]=true;
                    count--;
                }
            }
        }
        return ans;
    }
}
