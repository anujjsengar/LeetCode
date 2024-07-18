class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int max=0;
        for(int i=0;i<nums.length-1;i++){
            if(max<nums[i+1]-nums[i]){
                max=nums[i+1]-nums[i];
            }
        }
        return max;
    }
}