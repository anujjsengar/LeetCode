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