class Solution {
    public boolean isPalindrome(String str) {
        str=str.toLowerCase();
        String s="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z' || str.charAt(i)>= '0' && str.charAt(i)<= '9'){
                s=s+str.charAt(i);
            }
        }
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}