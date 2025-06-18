import java.util.Arrays;

class Solution {
    public double knightProbability(int n, int k, int row, int column) {
        double[][][] dp = new double[n][n][k + 1];
        for (double[][] d1 : dp) {
            for (double[] d2 : d1) {
                Arrays.fill(d2, -1.0);
            }
        }
        return solve(n, k, row, column, dp);
    }

    public double solve(int n, int k, int row, int col, double[][][] dp) {
        if (row < 0 || col < 0 || row >= n || col >= n) {
            return 0.0;
        }
        if (k == 0) {
            return 1.0;
        }
        if (dp[row][col][k] != -1.0) {
            return dp[row][col][k];
        }

        double count = 0.0;
        count += solve(n, k - 1, row - 2, col - 1, dp);
        count += solve(n, k - 1, row - 1, col - 2, dp);
        count += solve(n, k - 1, row + 1, col - 2, dp);
        count += solve(n, k - 1, row + 2, col - 1, dp);
        count += solve(n, k - 1, row + 2, col + 1, dp);
        count += solve(n, k - 1, row + 1, col + 2, dp);
        count += solve(n, k - 1, row - 1, col + 2, dp);
        count += solve(n, k - 1, row - 2, col + 1, dp);

        return dp[row][col][k] = count / 8.0;
    }
}
