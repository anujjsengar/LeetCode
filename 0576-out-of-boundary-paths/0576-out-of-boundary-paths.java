import java.util.Arrays;

class Solution {
    private static final int MOD = 1_000_000_007;

    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        int[][][] dp = new int[m][n][maxMove + 1]; 
        for (int[][] layer : dp) {
            for (int[] row : layer) {
                Arrays.fill(row, -1);
            }
        }
        return findPath(m, n, maxMove, startRow, startColumn, dp);
    }

    private int findPath(int m, int n, int maxMove, int i, int j, int[][][] dp) {
        if (i < 0 || j < 0 || i >= m || j >= n) {
            return 1;
        }
        if (maxMove == 0) {
            return 0;
        }
        if (dp[i][j][maxMove] != -1) {
            return dp[i][j][maxMove];
        }
        int up = findPath(m, n, maxMove - 1, i - 1, j, dp);
        int down = findPath(m, n, maxMove - 1, i + 1, j, dp);
        int left = findPath(m, n, maxMove - 1, i, j - 1, dp);
        int right = findPath(m, n, maxMove - 1, i, j + 1, dp);

        dp[i][j][maxMove] = ((up + down) % MOD + (left + right) % MOD) % MOD;
        return dp[i][j][maxMove];
    }
}
