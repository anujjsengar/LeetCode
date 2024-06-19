/*Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]*/
class Solution {
    public void moveZeroes(int[] nums) {
        //rotate(nums,2,4);
        int i=0;
        int n=nums.length-1;
        while(i<=n){
            if(nums[i]==0){
                rotate(nums,i,n);
                n--;
            }
            else{
                i++;
            }
        }
    }
    public void rotate(int[] arr,int left,int right){
        int first=arr[left];
        for(int i=left+1;i<=right;i++){
            arr[i-1]=arr[i];
        }
        arr[right]=first;
    }
}
