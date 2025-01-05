class Solution {
    public int minimumOperations(int[][] grid) {
        int n=grid.length;
        int m = grid[0].length;
       int ans = 0;
        for (int i =0;i< m;i++) {
            int max1 = grid[0][i];
            for (int j= 1; j < n;j++) {
                if (grid[j][i] <= max1) {
                    ans += max1 - grid[j][i]+1;
                    max1++;
                } else {
                    max1 = grid[j][i];
                }
            }
        }
        return ans;
    }
}