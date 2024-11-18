class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        int[] freq=new int[26];
        for(String s:strs){
            for(int i=0;i<s.length();i++){
                freq[s.charAt(i)-'a']=freq[s.charAt(i)-'a']+1;
            }
            String ans="";
            for(int i=0;i<26;i++){
                while(freq[i]!=0){
                    ans=ans+(i+'a');
                    freq[i]=freq[i]-1;
                }
            }
            if(!map.containsKey(ans)){
                map.put(ans,new ArrayList<>());
            }
            map.get(ans).add(s);
        }
        List<List<String>> li=new ArrayList<>();
        for(String key:map.keySet()){
            li.add(map.get(key));
        }
        return li;
    }
}