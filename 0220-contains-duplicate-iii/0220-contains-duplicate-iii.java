class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int i=0;i<nums.length;i++){
            if (i > indexDiff) {
                map.remove(nums[i - indexDiff - 1]);
            }
            Integer floor = map.floorKey(nums[i]);
            Integer ceiling = map.ceilingKey(nums[i]);
            if (floor != null && Math.abs((long) nums[i] - floor) <= valueDiff && Math.abs(i - map.get(floor)) <= indexDiff) {
                return true;
            }
            if (ceiling != null && Math.abs((long) nums[i] - ceiling) <= valueDiff && Math.abs(i - map.get(ceiling)) <= indexDiff) {
                return true;
            }

            map.put(nums[i],i);
            }
        return false;
    }
}