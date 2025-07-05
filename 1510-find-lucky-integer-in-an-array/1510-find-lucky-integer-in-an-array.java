class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int x=-1;
        Arrays.sort(arr);
        for(int i:arr){
            if(!map.containsKey(i)){
                map.put(i,0);
            }
            map.put(i,map.get(i)+1);
            // if(i==map.get(i)){
            //     x=i;
            // }
        }
        for(int i:map.keySet()){
            if(map.get(i)==i){
                x=i;
            }
        }
        return x;
    }
}