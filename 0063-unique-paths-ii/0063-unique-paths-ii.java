class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int dp[][]=new int[grid.length][grid[0].length];
        for(int[] d:dp){
            Arrays.fill(d,-1);
        }
        return solve(grid,0,0,dp);
    }
    public int solve(int[][] grid,int i,int j,int[][] dp){
        if(i>=grid.length || j>=grid[0].length || grid[i][j]==1){
            return 0;
        }
        if(i==grid.length-1 && j==grid[0].length-1){
            return 1;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int count=0;
        count+=solve(grid,i+1,j,dp);
        count+=solve(grid,i,j+1,dp);
        return dp[i][j]=count;
    }
}