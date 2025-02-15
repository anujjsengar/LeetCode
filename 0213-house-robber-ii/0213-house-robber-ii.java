class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        int f1=robber(nums,0,nums.length-1,dp);
        Arrays.fill(dp,-1);
        int f2=robber(nums,1,nums.length,dp);
        return Math.max(f1,f2);
    }
    public int robber(int[] nums,int i,int end,int[] dp){
        if(i>=end){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int left=nums[i]+robber(nums,i+2,end,dp);
        int right=robber(nums,i+1,end,dp);
        return dp[i]=Math.max(left,right);
    }
}