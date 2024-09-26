import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        if (nums == null || nums.length < 2) {
            return false;
        }

        Map<Integer, Integer> remainderMap = new HashMap<>();
        remainderMap.put(0, -1); // Initialize with a remainder of 0 at index -1.

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (k != 0) {
                sum = sum % k;
            }

            if (remainderMap.containsKey(sum)) {
                // Check if the subarray has at least two elements.
                if (i - remainderMap.get(sum) > 1) {
                    return true;
                }
            } else {
                remainderMap.put(sum, i);
            }
        }

        return false;
    }
}
