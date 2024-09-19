class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            if(!map.containsKey(i))
            map.put(i,0);
            map.put(i,map.get(i)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)-> map.get(b)-map.get(a));
        pq.addAll(map.keySet());
        int index=0;
        int[] ans=new int[k];
        while(k-->0){
            ans[index]=pq.poll();
            index++;
        }
        return ans;
    }
}