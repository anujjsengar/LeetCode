class Solution {
    public int countSubarrays(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-2;i++){
            System.out.println(nums[i]+" "+nums[i+1]+" "+nums[i+2]);
            if(nums[i+1]%2==0 && nums[i]+nums[i+2]==nums[i+1]/2){
                count++;
            }
        }
        return count;
    }
}