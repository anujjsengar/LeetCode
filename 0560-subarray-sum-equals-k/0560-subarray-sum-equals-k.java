class Solution{
    public int subarraySum(int[] num,int k){
        Map<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int count=0;
        for(int i=0;i<num.length;i++){
            sum=sum+num[i];
            if(sum==k){
                count++;
            }
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
