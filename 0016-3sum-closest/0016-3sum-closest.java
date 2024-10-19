class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int diff=Integer.MAX_VALUE;
        int close=target;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(Math.abs(target-sum)<diff){
                    diff=Math.abs(target-sum);
                    close=sum;
                }
                if(sum<target){
                    left++;
                }
                else if(sum>target){
                    right--;
                }
                else{
                    return target;
                }
            }
        }
        return close;
    }
}