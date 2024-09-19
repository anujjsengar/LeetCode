class Solution {
    public class info implements Comparable<info>{
        int value;
        int freq;
        public info(int value,int freq){
            this.value=value;
            this.freq=freq;
        }
        public int compareTo(info b){
            return this.freq-b.freq;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<info> pq=new PriorityQueue<>(Comparator.reverseOrder());
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            if(!map.containsKey(i))
            map.put(i,0);
            map.put(i,map.get(i)+1);
        }
        for(int i:map.keySet()){
            pq.add(new info(i,map.get(i)));
        }
        int index=0;
        int[] ans=new int[k];
        while(k-->0){
            ans[index]=pq.poll().value;
            index++;
        }
        return ans;
    }
}