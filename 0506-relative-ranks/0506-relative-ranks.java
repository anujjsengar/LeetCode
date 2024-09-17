class Solution {
    public class info implements Comparable<info>{
        int rank;
        int index;
        public info(int val,int index){
            this.rank=val;
            this.index=index;
        }
        public int compareTo(info b){
            return this.rank-b.rank;
        }
    }
    public String[] findRelativeRanks(int[] score) {
       PriorityQueue<info> pq=new PriorityQueue<>(Comparator.reverseOrder());
       for(int i=0;i<score.length;i++){
        pq.add(new info(score[i],i));
       }
       String[] s=new String[score.length];
       int pos=1;
       while(!pq.isEmpty()){
        info curr=pq.poll();
        if(pos==1){
            s[curr.index]="Gold Medal";
        }
        else if(pos==2){
            s[curr.index]="Silver Medal";
        }
        else if(pos==3){
            s[curr.index]="Bronze Medal";
        }
        else{
            s[curr.index]=""+pos;
        }
        pos++;
       }
       return s;
}
}