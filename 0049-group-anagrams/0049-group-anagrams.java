class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> map=new HashMap<>();
        for(String st:strs){
            int [] freq=new int[26];
            for(int i=0;i<st.length();i++){
                freq[st.charAt(i)-'a']+=1;
            }
            String ans="";
            for(int i=0;i<26;i++){
                int n=freq[i];
                while(n-->0){
                    ans=ans+(i+'a');
                }
            }
            if(!map.containsKey(ans)){
                map.put(ans,new ArrayList<>());
            }
            map.get(ans).add(st);
        }
        List<List<String>> res=new ArrayList<>();
        for(String s:map.keySet()){
            res.add(new ArrayList(map.get(s)));
        }
        return res;
    }
}