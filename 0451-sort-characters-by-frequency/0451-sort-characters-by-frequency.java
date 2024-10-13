class Solution {
    public class Node{
        char c;
        int freq;
        public Node(char c,int freq){
            this.c=c;
            this.freq=freq;
        }
    }
    public String frequencySort(String s) {
        Map<Character,Integer> map=new HashMap<>();
        PriorityQueue<Node> pq=new PriorityQueue<>((a,b)-> b.freq-a.freq);
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),0);
            }
            map.put(s.charAt(i),map.get(s.charAt(i))+1);
        }
        for(char c:map.keySet()){
            pq.add(new Node(c,map.get(c)));
        }
        String ans="";
        while(!pq.isEmpty()){
            Node curr=pq.poll();
            int n=curr.freq;
            while(n-->0){
                ans=ans+curr.c;
            }
        }
        return ans;
    }
}