class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = -1;
        int last = -1;
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            if (first == -1) {
                if (nums[left] == target) {
                    first = left;
                } else {
                    left++;
                }
            }
            
            if (last == -1) {
                if (nums[right] == target) {
                    last = right;
                } else {
                    right--;
                }
            }
            if (first != -1 && last != -1) {
                break;
            }
        }
        
        return new int[]{first, last};
    }
}
