class Solution {
     private int[] prefixSum;
    private int[][] mem;

    private int findMaxSum(int[] nums, int pos, int count, int k) {
        if (count == 3) return 0;
        if (pos > nums.length - k) return 0;
        if (mem[pos][count] != -1) return mem[pos][count];

        // Don't start subarray here
        int dontStart = findMaxSum(nums, pos + 1, count, k);

        // Start subarray here
        int startHere = findMaxSum(nums, pos + k, count + 1, k) + prefixSum[pos + k] - prefixSum[pos];

        return mem[pos][count] = Math.max(dontStart, startHere);
    }

    private void findMaxSumPath(int[] nums, int pos, int count, int k, List<Integer> path) {
        if (count == 3) return;
        if (pos > nums.length - k) return;

        // Don't start subarray here
        int dontStart = findMaxSum(nums, pos + 1, count, k);

        // Start subarray here
        int startHere = findMaxSum(nums, pos + k, count + 1, k) + prefixSum[pos + k] - prefixSum[pos];

        // Choose optimal path
        if (startHere >= dontStart) {
            path.add(pos);
            findMaxSumPath(nums, pos + k, count + 1, k, path); // Include pos
        } else {
            findMaxSumPath(nums, pos + 1, count, k, path); // Don't include pos
        }
    }

    public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
        int n = nums.length;
        mem = new int[n][3];
        for (int[] row : mem) Arrays.fill(row, -1);

        // Calculate Prefix-Sum
        prefixSum = new int[n + 1];
        for (int i = 0; i < n; ++i) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }

        // Find max_sum value
        findMaxSum(nums, 0, 0, k);

        // Find subarray start indices with max_sum value
        List<Integer> path = new ArrayList<>();
        findMaxSumPath(nums, 0, 0, k, path);

       int[] ans = new int[3];
       for(int i=0;i<3 ;i++){
        ans[i] = path.get(i);
       }
       return ans;
    }
}