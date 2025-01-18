class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        return find(nums,target,0,0,map);
    }
    public int find(int[] nums,int target,int i,int used,HashMap<Integer,Integer> map){
        if(target==0 && used==nums.length){
            return 1;
        }
        if(i==nums.length){
            return 0;
        }
        /*if(map.containsKey(target)){
            return map.get(target);
        }*/
        int pos=find(nums,target-nums[i],i+1,used+1,map);
        int neg=find(nums,target+nums[i],i+1,used+1,map);
        map.put(target,neg+pos);
        return neg+pos;
    }
}