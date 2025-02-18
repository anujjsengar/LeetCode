class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int ans1=(nums[0]-1)*(nums[1]-1);
        int ans2=(nums[nums.length-2]-1)*(nums[nums.length-1]-1);
        return ans1>ans2?ans1:ans2;
    }
}