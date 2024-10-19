class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> map=new HashMap<>();
        for(char c:ransomNote.toCharArray()){
            map.putIfAbsent(c,0);
            map.put(c,map.get(c)+1);
        }
        for(char c:magazine.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)-1);
                if(map.get(c)==0){
                    map.remove(c);
                }
            }
        }
        return map.isEmpty();
    }
}