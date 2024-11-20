class Solution {
    public int evalRPN(String[] tokens) {
        int ans=0;
        Stack<String> st=new Stack<>();
        for(String i:tokens){
            if(i.equals("+") || i.equals("-") || i.equals("*") || i.equals("/")){
                int a=Integer.parseInt(st.pop());
                int b=Integer.parseInt(st.pop());
                if(i.equals("+")){
                    st.push(a+b+"");
                }
                else if(i.equals("-")){
                    st.push(b-a+"");
                }
                else if(i.equals("*")){
                    st.push(b*a+"");
                }
                else{
                    st.push(b/a+"");
                }
            }
            else{
                st.push(i);
            }
        }
        return Integer.parseInt(st.pop());
    }
}