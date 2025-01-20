class Solution {
    public boolean canJump(int[] nums) {
        int dp[] =new int[nums.length];
        Arrays.fill(dp,-1);
        return jump(nums,0,dp);
    }
    public boolean jump(int[] nums,int i,int dp[]){
        if(i==nums.length-1){
            return true;
        }
        if(i>=nums.length){
            return false;
        }
        if(dp[i]!=-1){
            return dp[i]==1;
        }
        boolean check=false;
        for(int j=1;j<=nums[i];j++){
            check=check || jump(nums,i+j,dp);
            if(check) break;
        }
        dp[i]=(check)?1:0;
        return check;
    }
}