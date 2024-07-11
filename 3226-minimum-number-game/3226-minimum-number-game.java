class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int[] arr=new int[nums.length];
        for(int i=0;i<arr.length-1;i=i+2){
            arr[i]=nums[i+1];
            arr[i+1]=nums[i];
        }
    return arr;
    }
}