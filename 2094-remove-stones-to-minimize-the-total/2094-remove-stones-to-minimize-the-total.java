class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<piles.length;i++){
            pq.add(piles[i]);
        }
        while(k-->0){
            int x=pq.poll();
            if(x%2==0){
                pq.add(x/2);
            }
            else{
                pq.add(x/2+1);
            }
        }
        int sum=0;
        while(!pq.isEmpty()){
            sum=sum+pq.poll();
        }
        return sum;
    }
}