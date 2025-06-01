class Solution {
    static final int MOD = 1_000_000_007;
    public long distributeCandies(int n, int limit) {
        long res = 0;
        for (int mask = 0; mask < (1 << 3); mask++) {
            int sum = n;
            int bits = 0;

            for (int i = 0; i < 3; i++) {
                if ((mask & (1 << i)) != 0) {
                    sum -= (limit + 1);
                    bits++;
                }
            }
            if (sum < 0) continue;
            long ways = comb(sum + 2, 2);
            if (bits % 2 == 0) res += ways;
            else res -= ways;
        }
        return res;
    }
    private long comb(int n, int r) {
        if (r < 0 || r > n) return 0;
        long num = 1, den = 1;
        for (int i = 0; i < r; i++) {
            num *= (n - i);
            den *= (i + 1);
        }
        return num / den;
    }
}
