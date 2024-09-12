import java.math.BigInteger;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<BigInteger> pq=new PriorityQueue<>(Comparator.reverseOrder());
        for(String  i: nums){
            pq.add(new BigInteger(i));
        }
        while(k-->1){
            pq.poll();
        }
        return pq.peek().toString();
    }
}