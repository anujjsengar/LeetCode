class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<stones.length();i++){
            if(!map.containsKey(stones.charAt(i))){
                map.put(stones.charAt(i),0);
            }
            map.put(stones.charAt(i),map.get(stones.charAt(i))+1);
        }
        int count=0;
        for(int i=0;i<jewels.length();i++){
            if(map.containsKey(jewels.charAt(i))){
                count+=map.get(jewels.charAt(i));
            }
        }
        return count;
    }
}