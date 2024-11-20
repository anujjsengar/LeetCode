class Solution {
    public int evalRPN(String[] tokens) {
        int ans=0;
        Stack<Integer> st=new Stack<>();
        for(String i:tokens){
            if(i.equals("+") || i.equals("-") || i.equals("*") || i.equals("/")){
                int a=st.pop();
                int b=st.pop();
                if(i.equals("+")){
                    st.push(a+b);
                }
                else if(i.equals("-")){
                    st.push(b-a);
                }
                else if(i.equals("*")){
                    st.push(b*a);
                }
                else{
                    st.push(b/a);
                }
            }
            else{
                st.push(Integer.parseInt(i));
            }
        }
        return st.pop();
    }
}