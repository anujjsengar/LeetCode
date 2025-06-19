class Solution {
    public int findPeakElement(int[] nums) {
        int left=0;
        int right=nums.length-1;
        while(left<right){
            boolean flag=true;
            if(nums[left]<nums[left+1]){
                left++;
                flag=false;
            }
            if(nums[right]<nums[right-1]){
                right--;
                flag=false;
            }
            if(flag){
                int max=Math.max(nums[left],nums[right]);
                if(max!=nums[left]){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return left--;
    }
}