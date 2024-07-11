class Solution {
    public int findDuplicate(int[] nums) {
        int big=0;
        for(int i=0;i<nums.length;i++){
            if(big<nums[i])
            big=nums[i];
        }
        int[] freq=new int[big+1];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]+=1;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]>1){
                return i;
            }
        }
        return -1;
    }
}