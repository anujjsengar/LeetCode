class Solution {
    public int firstMissingPositive(int[] nums) {
        TreeSet<Integer> set=new TreeSet<>();
        int min=1;
        for(int i:nums){
            set.add(i);
        }
        while(set.contains(min)){
            min++;
        }
        return min;
    }
}