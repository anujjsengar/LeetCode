class Solution {
    public int change(int amount, int[] coins) {
        int dp[][]=new int[amount+1][coins.length];
        for(int []d:dp){
            Arrays.fill(d,-1);
        }
        return solve(amount, coins, 0,dp);
    }

    public int solve(int amount, int[] coins, int i,int[][] dp) {
        if (amount == 0) return 1;
        if (amount < 0 || i >= coins.length) return 0;
        if(dp[amount][i]!=-1){
            return dp[amount][i];
        }
        int count = 0;
        count += solve(amount - coins[i], coins, i,dp);    
        count += solve(amount, coins, i + 1,dp);          

        return dp[amount][i]=count;
    }
}
