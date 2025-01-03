class Solution {
    public int waysToSplitArray(int[] nums) {
        long sum=0;
        HashMap<Integer,Long> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            //System.out.println(sum);
            map.put(i,sum);
        }
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            //System.out.println(map.get(nums.length-1)-map.get(i)>=0);
            if(map.get(i)>=map.get(nums.length-1)-map.get(i)){
                count++;
            }
        }
        return count;
    }
}