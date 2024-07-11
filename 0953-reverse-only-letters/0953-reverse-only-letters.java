class Solution {
    public String reverseOnlyLetters(String s) {
        String ans="";
        int lp=s.length()-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='A' && s.charAt(i)<='Z'){
                while(!(s.charAt(lp)>='a' && s.charAt(lp)<='z' || s.charAt(lp)>='A' && s.charAt(lp)<='Z')){
                    lp--;
                }
                ans=ans+s.charAt(lp);
                lp--;
            }
            else{
                ans=ans+s.charAt(i);
            }
        }
        return ans;
    }
}