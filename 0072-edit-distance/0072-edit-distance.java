class Solution {
    public int minDistance(String word1, String word2) {
        int dp[][]=new int[word1.length()][word2.length()];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        return dist(word1,word2,0,0,dp);
    }
    public int dist(String word1,String word2,int i,int j,int[][] dp){
         if (i == word1.length()) {
            return word2.length() - j;
        }
        if (j == word2.length()) {
            return word1.length() - i;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(word1.charAt(i)==word2.charAt(j)){
            return dp[i][j]=dist(word1,word2,i+1,j+1,dp);
        }
        int insert=1+dist(word1,word2,i,j+1,dp);
        int delete=1+dist(word1,word2,i+1,j,dp);
        int replace=1+dist(word1,word2,i+1,j+1,dp);
        return dp[i][j]=Math.min(insert, Math.min(delete, replace));
    }
}