class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq=new PriorityQueue<>();
        for(int num:nums){
            pq.add(Long.valueOf(num));
        }
        int count=0;
        while(!pq.isEmpty()){
            long curr=pq.poll();
            if(curr>=k){
                break;
            }
            count++;
            long sec=pq.poll();
            pq.add(curr*2+sec);
        }
        return count;
    }
}