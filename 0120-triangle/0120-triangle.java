class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int dp[][]=new int[triangle.size()][triangle.size()];
        for(int [] row:dp){
            Arrays.fill(row,Integer.MAX_VALUE);
        }
        return solve(triangle,0,0,dp);
    }
    public int solve(List<List<Integer>> triangle,int i,int j,int[][] dp){
        if(i==triangle.size()-1){
            return triangle.get(i).get(j);
        }
        if(j>=triangle.get(i).size()){
            return Integer.MAX_VALUE;
        }
        if(dp[i][j]!=Integer.MAX_VALUE){
            return dp[i][j];
        }
        return dp[i][j]=Math.min(solve(triangle,i+1,j,dp),solve(triangle,i+1,j+1,dp))+triangle.get(i).get(j);
    }
}