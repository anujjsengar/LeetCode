class Solution {
    public int maximumCount(int[] nums) {
        int pos=0;
        int neg=0;
        int zer=0;
        for(int i:nums){
            if(i>0){
                pos++;
            }
            else if(i==0){
                zer=0;
            }
            else{
                neg++;
            }
        }
        return Math.max(pos,neg);
    }
}