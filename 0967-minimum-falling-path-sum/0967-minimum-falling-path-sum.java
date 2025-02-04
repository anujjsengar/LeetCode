class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int[][] dp=new int[n][n]; 
        for (int[] row : dp) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<matrix[0].length;i++){
            int ans=pathsum(matrix,0,i,dp);
            min = Math.min(min, ans);
        }
        return min;
    }
    public int pathsum(int[][] matrix,int i,int j,int[][] dp){
        if(j>=matrix[0].length || j<0){
            return Integer.MAX_VALUE;
        }
        if(i==matrix.length-1){
            return matrix[i][j];
        }
        if(dp[i][j]!=Integer.MAX_VALUE){
            return dp[i][j];
        }
        int x=pathsum(matrix,i+1,j+1,dp);
        int y=pathsum(matrix,i+1,j,dp);
        int z=pathsum(matrix,i+1,j-1,dp);
        return dp[i][j]=Math.min(x,Math.min(y,z))+matrix[i][j];
    }
}