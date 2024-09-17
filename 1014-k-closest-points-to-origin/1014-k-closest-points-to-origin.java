class Solution {
    public class info implements Comparable<info>{
        int[] point;
        float distance;
        public info(int[] point){
            this.point=point;
            this.distance=(float)Math.pow(Math.pow(point[0],2)+Math.pow(point[1],2),0.5);
        }
        public int compareTo(info b){
            if(this.distance>b.distance){
                return 1;
            }
            else if(this.distance<b.distance){
                return -1;
            }
            return 0;
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<info> pq=new PriorityQueue<>();
        for(int i=0;i<points.length;i++){
            pq.add(new info(points[i]));
        }
        int[][] ans=new int[k][2];
        int index=0;
        while(!pq.isEmpty() && k-->0){
            ans[index]=pq.poll().point;
            index++;
        }
        return ans;
    }
}