class Solution {
    public int findKthLargest(int[] arr, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        for(int i:arr){
            pq.add(i);
        }
        while(k-->1){
            pq.poll();
        }
        return pq.peek();
    }
}