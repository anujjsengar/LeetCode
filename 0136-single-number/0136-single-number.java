class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            if(!map.containsKey(i)){
                map.put(i,0);
            }
            map.put(i,map.get(i)+1);
        }
        for(Integer i:map.keySet()){
            if(map.get(i)==1){
                return i;
            }
        }
        return -1;
    }
}