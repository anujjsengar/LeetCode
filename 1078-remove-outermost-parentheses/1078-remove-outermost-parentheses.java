class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st=new Stack();
        String str="";
        int open=0;
        int close=0;
        // String str="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                open++;
            }
            else{
                close++;
            }
            st.push(s.charAt(i));
            if(open==close & open!=0){
                st.pop();
                str=str+soln(st,"");
                open=0;
                close=0;
            }
        }
        return str;
    }
    public static String soln(Stack<Character> st,String ans){
        if(st.size()==1){
            st.pop();
        }
        if(st.isEmpty()){
            return ans;
        }
        //if(!st.isEmpty())
        ans=st.pop()+ans;
        return soln(st,ans);
    }
}