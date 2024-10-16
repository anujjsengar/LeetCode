class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int hf=0;
        for(int i:nums){
            if(!map.containsKey(i)){
                map.put(i,0);
            }
            map.put(i,map.get(i)+1);
            if(map.get(i)>hf){
                hf=map.get(i);
            }
        }
        int count=0;
        for(int i:map.keySet()){
            if(map.get(i)==hf){
                count++;
            }
        }
        return count*hf;
    }
}