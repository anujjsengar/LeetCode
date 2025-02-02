class Solution {
    private static final int MOD = 1_000_000_007;
    public int numRollsToTarget(int n, int k, int target) {
        int [][] dp=new int[n+1][target+1];
        for(int[] i:dp){
            Arrays.fill(i,-1);
        }
        return solve(n,k,target,dp);
    }
    public int solve(int n,int k,int target,int[][] dp){
        if(target==0 && n==0){
            return 1;
        }
        if(n==0 || target<0){
            return 0;
        }
        if(dp[n][target]!=-1){
            return dp[n][target];
        }
        int sum=0;
        for(int i=1;i<=k;i++){
            sum = (sum + solve(n - 1, k, target - i, dp)) % MOD;
        }
        return dp[n][target]=sum;
    }
}