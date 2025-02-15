class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int[][] dp=new int[nums1.length][nums2.length];
        for(int[] d:dp){
            Arrays.fill(d,-1);
        }
        return solve(nums1,nums2,0,0,dp);
    }
    public int solve(int[] arr1, int[] arr2, int i, int j, int[][] dp) {
    if (i == arr1.length || j == arr2.length) {
        return 0;
    }
    // if (i > j) {
    //     return 0;
    // }
    if (dp[i][j] != -1) {
        return dp[i][j];
    }
    if (arr1[i] == arr2[j]) {
        dp[i][j] = 1 + solve(arr1, arr2, i + 1, j + 1, dp);
    } else {
        dp[i][j] = Math.max(solve(arr1, arr2, i + 1, j, dp), solve(arr1, arr2, i, j + 1, dp));
    }
    return dp[i][j];
}

}