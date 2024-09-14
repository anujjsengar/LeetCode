class Solution {
    public class Info implements Comparable<Info> {
        int index;
        int sol;
        public Info(int index,int sol){
            this.index=index;
            this.sol=sol;
        }
        public int compareTo(Info other) {
        if(this.sol==other.sol){
            return Integer.compare(this.index, other.index);
        }
        return Integer.compare(this.sol, other.sol);
    }
    }
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<Info>pq =new PriorityQueue<>();
        for(int i=0;i<mat.length;i++){
            int max=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    max++;
                }
            }
            pq.add(new Info(i,max));
        }
        int[] ans=new int[k];
        int index=0;
        while(k-->0){
            ans[index]=pq.poll().index;
            index++;
        }
        return ans;
    }
}