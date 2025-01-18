class Solution {
    public boolean isSubsequence(String s, String t) {
        int dp[][]=new int[t.length()][s.length()];
        for(int i=0;i<t.length();i++){
            for(int j=0;j<s.length();j++){
                dp[i][j]=-1;
            }
        }
        return check(s,t,0,0,dp);
    }
    public boolean check(String s,String t,int i,int j,int dp[][]){
        if(j==s.length()){
            return true;
        }
        if(i==t.length()){
            return false;
        }
        if(dp[i][j]!=-1){
            return dp[i][j]==0?false:true;
        }
        boolean include=false;
        boolean exclude=false;
        if(s.charAt(j)==t.charAt(i)){
            include=check(s,t,i+1,j+1,dp);
        }
        exclude=check(s,t,i+1,j,dp);
        dp[i][j]=include || exclude ? 1:0;
        return include || exclude;
    }
}