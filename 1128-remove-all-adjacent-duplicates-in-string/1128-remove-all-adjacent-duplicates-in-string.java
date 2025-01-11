class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            boolean flag=true;
            while(!st.isEmpty() && st.peek()==s.charAt(i)){
                st.pop();
                flag=false;
            }
            if(flag){st.push(s.charAt(i));}
        }
        String ans="";
        while(!st.isEmpty()){
            ans=st.pop()+ans;
        }
        return ans;
    }
}