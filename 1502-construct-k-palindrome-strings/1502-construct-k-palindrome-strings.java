class Solution {
    public boolean canConstruct(String s, int k) {
        HashMap<Character,Integer> map=new HashMap<>();
        if(s.length()<k){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),0);
            }
            map.put(s.charAt(i),map.get(s.charAt(i))+1);
        }
        int count=0;
        for(char i:map.keySet()){
            if(map.get(i)%2!=0){
                count++;
            }
        }
        if(count<=k){
            return true;
        }
        return false;
    }
}