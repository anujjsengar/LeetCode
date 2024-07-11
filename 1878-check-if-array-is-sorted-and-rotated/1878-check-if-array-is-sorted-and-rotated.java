class Solution {
    public boolean check(int[] nums) {
        //return sort(nums);
        int i=0;
        while(i<=nums.length){
            if(sort(nums)){
                return true;
            }
            rotate(nums);
            i++;
        }
        return false;
    }
    public boolean sort(int [] nums){
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                return false;
            }
        }
        return true;
    }
    public void rotate(int arr[]){
        int first=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=first;
    }
}