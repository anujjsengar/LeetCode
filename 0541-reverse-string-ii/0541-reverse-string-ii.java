class Solution {
    public String reverseStr(String s, int k) {
        int i=0;
        while(i<s.length()){
            if(s.length()-i<k){
                s=s.substring(0,i)+reverse(s.substring(i,s.length()));
                break;
            }
            s=s.substring(0,i)+reverse(s.substring(i,i+k))+s.substring(i+k,s.length());
            i=i+2*k;
        }
        return s;   
    }
    public String reverse(String s){
        String rev="";
        for(int i=0;i<s.length();i++){
            rev=s.charAt(i)+rev;
        }
        return rev;
    }
}