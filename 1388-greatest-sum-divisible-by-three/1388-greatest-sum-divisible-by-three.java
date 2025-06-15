class Solution {
    public int maxSumDivThree(int[] nums) {
        int[][] dp = new int[nums.length + 1][3];
        for (int[] row : dp) Arrays.fill(row, -1);
        return solve(nums, 0, 0, dp);
    }

    public int solve(int[] nums, int i, int mod, int[][] dp) {
        if (i == nums.length) {
            return (mod == 0) ? 0 : Integer.MIN_VALUE;
        }
        if (dp[i][mod] != -1) {
            return dp[i][mod];
        }
        int take = nums[i] + solve(nums, i + 1, (mod + nums[i]) % 3, dp);
        int skip = solve(nums, i + 1, mod, dp);
        dp[i][mod] = Math.max(take, skip);
        return dp[i][mod];
    }
}
