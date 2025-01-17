class Solution {
    public int numDistinct(String s, String t) {
        int[][] dp=new int[s.length()][t.length()];
        for(int i=0;i<s.length();i++){
            for(int j=0;j<t.length();j++){
                dp[i][j]=-1;
            }
        }
        return solve(s,t,0,0,dp);
    }
    public int solve(String s,String t,int i,int j,int dp[][]){
        if(j==t.length()){
            return 1;
        }
        if(i==s.length()){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int include=0;
        int exclude=0;
        if(s.charAt(i)==t.charAt(j)){
            include=solve(s,t,i+1,j+1,dp);
        }
        exclude=solve(s,t,i+1,j,dp);
        return dp[i][j]=include+exclude;
    }
}