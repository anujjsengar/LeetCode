class Solution {
    int max = Integer.MIN_VALUE;

    public int maxProduct(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int prod = 1;
            for (int j = i; j < nums.length; j++) {
                prod *= nums[j]; 
                max = Math.max(max, prod);
            }
        }
        return max;
    }
}
