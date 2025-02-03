class Solution {
    public String longestPalindrome(String s) {
        Boolean dp[][]= new Boolean[s.length()][s.length()]; 
        String longestPalindrome = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (isPalindrome(s, i, j,dp) && (j - i + 1) > longestPalindrome.length()) {
                    longestPalindrome = s.substring(i, j + 1);
                }
            }
        }
        return longestPalindrome;
    }
    private static boolean isPalindrome(String s, int left, int right,Boolean dp[][]) {
        if (left >= right) return true;
        if (dp[left][right] != null) return dp[left][right];

        if (s.charAt(left) == s.charAt(right)) {
            dp[left][right] = isPalindrome(s, left + 1, right - 1,dp);
        } else {
            dp[left][right] = false;
        }
        return dp[left][right];
    }
}