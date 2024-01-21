class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];
        int sum=nums.length;
        for(int i=0;i<sum-1;i++){
            for(int j=i+1;j<sum;j++){
                if(nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                    break;
                }
            }
        }
        return result;
    }
}
