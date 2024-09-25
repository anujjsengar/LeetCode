class Solution {
    public int longestConsecutive(int[] arr) {
       HashMap<Integer,Boolean> map=new HashMap<>();
       for(int i:arr){
        if(map.containsKey(i+1)){
            map.put(i+1,false);
        }
        if(map.containsKey(i-1)){
            map.put(i,false);
        }
        else{
            map.put(i,true);
        }
       }
       int ans=0;
       for(int i:map.keySet()){
        if(map.get(i)==true){
            int count=1;
            while(map.containsKey(i+1) && map.get(i+1)==false){
                count++;
                i++;
            }
            if(ans<count){
                ans=count;
            }
        }
       }
       return ans;
    }

}