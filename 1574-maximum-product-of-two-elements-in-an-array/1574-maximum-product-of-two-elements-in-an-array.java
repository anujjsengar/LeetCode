class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                pq.add((nums[i]-1)*(nums[j]-1));
            }
        }
        return pq.peek();
    }
}