class Solution {
    public int numDecodings(String s) {
        int[] memo=new int[s.length()];
        Arrays.fill(memo,-1);
        return solve(s,0,memo);
    }
    public int solve(String s,int index,int[] memo){
        if(index==s.length()){
            return 1;
        }
        if(s.charAt(index)=='0'){
            return 0;
        }
        if(memo[index]!=-1){
            return memo[index];
        }
        int count=solve(s,index+1,memo);
        if (index + 1 < s.length() && Integer.parseInt(s.substring(index, index + 2)) <= 26) {
            count += solve(s, index + 2, memo);
        }
        memo[index] = count;
        return count;
    }
}