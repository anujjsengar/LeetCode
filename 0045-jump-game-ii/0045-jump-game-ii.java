class Solution {
    public int jump(int[] nums) {
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        return find(nums,0,dp);
    }
    public int find(int[] nums,int i,int [] dp){
        if(i==nums.length-1){
            return 0;
        }
        if(i>=nums.length){
            return Integer.MAX_VALUE;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int counter=Integer.MAX_VALUE;
        for(int j=1;j<=nums[i];j++){
            int next = find(nums, i + j, dp);
            if (next != Integer.MAX_VALUE) {
                counter = Math.min(counter, next + 1);
            }
        }
        return dp[i]=counter;
    }
    
}