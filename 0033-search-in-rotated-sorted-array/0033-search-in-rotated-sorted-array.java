class Solution {
    public int search(int[] nums, int target) {
        /*int p=nums.length/2;
        while(p-->0){
            int x=nums[0];
            for(int i=0;i<nums.length-1;i++){
                nums[i]=nums[i+1];
            }
            nums[nums.length-1]=x;
            System.out.println(nums[nums.length-1]);
        }*/
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
}