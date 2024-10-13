class Solution {
    public class info implements Comparable<info> {
        String str;
        int freq;
        public info(String str,int freq){
            this.str=str;
            this.freq=freq;
        }
        public int compareTo(info b){
            if(this.freq==b.freq){
                return b.str.compareTo(this.str);
            }
            return this.freq-b.freq;
        }
    }
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map=new HashMap<>();
        for(String i: words){
            if(!map.containsKey(i)){
                map.put(i,0);
            }
            map.put(i,map.get(i)+1);
        }
        PriorityQueue<info> pq=new PriorityQueue<>(Comparator.reverseOrder());
        for(String str:map.keySet()){
            pq.add(new info(str,map.get(str)));
        }
        List<String> li=new ArrayList<>();
        while(k-->0){
            li.add(pq.poll().str);
        }
        return li;
    }
}