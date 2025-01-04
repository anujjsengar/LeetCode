class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int dp[][]=new int[text1.length()+1][text2.length()+1];
        for (int i = 0; i <= text1.length(); i++) {
            for (int j = 0; j <= text2.length(); j++) {
                dp[i][j] = -1;
            }
        }
        return solve(text1,text2,dp);
    }
    public int solve(String text1,String text2,int[][] dp){
        if(text1.length()==0 || text2.length()==0){
            return 0;
        }
        if(dp[text1.length()][text2.length()]!=-1){
            return dp[text1.length()][text2.length()];
        }
        if(text1.charAt(text1.length()-1)==text2.charAt(text2.length()-1)){
            return dp[text1.length()][text2.length()]=1+solve(text1.substring(0,text1.length()-1),text2.substring(0,text2.length()-1),dp);
        }
        else{
            return dp[text1.length()][text2.length()]=Math.max(solve(text1.substring(0,text1.length()-1),text2.substring(0,text2.length()),dp),solve(text1.substring(0,text1.length()),text2.substring(0,text2.length()-1),dp));
        }
    }
}