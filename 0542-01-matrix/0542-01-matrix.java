class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int[][] dp = new int[rows][cols];
        int max = rows + cols;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 0) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = max;
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] != 0) {
                    int min = max;
                    if (i - 1 >= 0) min = Math.min(min, dp[i - 1][j] + 1);
                    if (j - 1 >= 0) min = Math.min(min, dp[i][j - 1] + 1);
                    dp[i][j] = min;
                }
            }
        }
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 0; j--) {
                if (mat[i][j] != 0) {
                    if (i + 1 < rows) dp[i][j] = Math.min(dp[i][j], dp[i + 1][j] + 1);
                    if (j + 1 < cols) dp[i][j] = Math.min(dp[i][j], dp[i][j + 1] + 1);
                }
            }
        }
        return dp;
    }
}
