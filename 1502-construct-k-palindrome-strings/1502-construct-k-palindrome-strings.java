class Solution {
    public boolean canConstruct(String s, int k) {
        HashMap<Character,Integer> map=new HashMap<>();
        if(s.length()<k){
            return false;
        }
        int count=0;
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),0);
            }
            if(map.get(s.charAt(i))%2==0){
                count++;
            }
            else{
                count--;
            }
            map.put(s.charAt(i),map.get(s.charAt(i))+1);
        }
        if(count<=k){
            return true;
        }
        return false;
    }
}