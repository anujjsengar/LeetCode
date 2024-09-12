import java.math.BigInteger;

class Solution {
    public int numTrees(int n) {
        if (n == 0) return 1;
        BigInteger fact2n = factorial(2 * n);
        BigInteger factN1 = factorial(n + 1);
        BigInteger factN = factorial(n);
        BigInteger result = fact2n.divide(factN1.multiply(factN));
        return result.intValue();
    }

    private BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
