class Solution {
    public int findClosestNumber(int[] nums) {
        int min=Integer.MAX_VALUE;
        int idx=0;
        for(int i=0;i<nums.length;i++){
            int diff=Math.abs(nums[i]-0);
            if(diff==min){
                if(nums[i]>nums[idx]){
                    idx=i;
                }
            }
            if(diff<min){
                min=diff;
                idx=i;
            }
        }
        return nums[idx];
    }
}