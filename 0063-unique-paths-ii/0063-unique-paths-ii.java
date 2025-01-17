class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int dp[][]=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                dp[i][j]=-1;
            }
        }
        if(grid[0][0]==1 || grid[grid.length-1][grid[0].length-1]==1){
            return 0;
        }
        return solve(grid,0,0,dp);
    }
    public int solve(int[][] grid,int i,int j,int[][] dp){
        if (i == grid.length - 1 && j == grid[0].length - 1) {
            return 1;
        }
        if(i==grid.length || j==grid[0].length){
            return 0;
        }
        if(grid[i][j]==1){
            return dp[i][j]=0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int right=solve(grid,i+1,j,dp);
        int down=solve(grid,i,j+1,dp);
        return dp[i][j]=right+down;
    }
}