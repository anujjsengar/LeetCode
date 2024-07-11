class Solution {
    public String reverseParentheses(String s) {
        while(s.contains("(")){
            int start=s.lastIndexOf('(');
            int end=s.indexOf(')',start);
            String str=s.substring(start,end+1);
            s = s.substring(0, start) + reverse(str,"",1) + s.substring(end + 1);
            continue;
        }
        return s;
    }
    public String reverse(String s,String ans,int i){
        if(s.length()==2 || i==s.length()-1){
            return ans;
        }
        ans=s.charAt(i)+ans;
        return reverse(s,ans,i+1);
    }
}