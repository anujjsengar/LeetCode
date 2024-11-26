class Solution {
    public String findDifferentBinaryString(String[] nums) {
        for(int i=0;i<=16;i++){
            String ans=Integer.toBinaryString(i);
            while(ans.length()<nums.length){
                ans="0"+ans;
            }
            Boolean flag=true;
            for(String s: nums){
                if(s.equals(ans)){
                    flag=false;
                    break;
                }
            }
            if(flag){
                return ans;
            }
        }
        return "";
    }
}