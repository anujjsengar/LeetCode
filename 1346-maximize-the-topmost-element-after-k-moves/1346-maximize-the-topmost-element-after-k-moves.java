class Solution {
    public int maximumTop(int[] nums, int k) {
        int max=nums[0];
        int i=0;
        if(nums.length==1 && k%2!=0){
            return -1;
        }
        if(k==1){
            return nums[1];
        }
        for(;i<Math.min(k - 1, nums.length);i++){
            if(max<nums[i]){
                max=nums[i];
            }
        }
        if(k!=0 && i+1<nums.length && max<nums[i+1]){
            max=nums[i+1];
        }
        return max;
    }
}