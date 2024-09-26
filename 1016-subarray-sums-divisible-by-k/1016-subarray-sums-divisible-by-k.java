class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> remainderMap = new HashMap<>();
        remainderMap.put(0, 1);
        int sum = 0;
        int count = 0;

        for (int num : nums) {
            sum += num;
            int remainder = sum % k;
            
            if (remainder < 0) {
                remainder += k;
            }
            
            if (remainderMap.containsKey(remainder)) {
                count += remainderMap.get(remainder);
            }
            
            remainderMap.put(remainder, remainderMap.getOrDefault(remainder, 0) + 1);
        }
        return count;
    }
}
