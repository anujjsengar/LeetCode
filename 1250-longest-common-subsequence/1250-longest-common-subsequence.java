class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp=new int[text1.length()][text2.length()];
        for (int i = 0; i < text1.length(); i++) {
            for (int j = 0; j < text2.length(); j++) {
                dp[i][j] = -1;
            }
        }
        return solve(text1,text2,0,0,dp);
    }
    public int solve(String text1,String text2,int i,int j,int[][] dp){
        if(text1.length()==i || text2.length()==j){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int count=0;
        if(text1.charAt(i)==text2.charAt(j)){
            count=1+solve(text1,text2,i+1,j+1,dp);
        }
        else{
            count=Math.max(solve(text1,text2,i+1,j,dp),solve(text1,text2,i,j+1,dp));
        }
        return dp[i][j]=count;
    }
}