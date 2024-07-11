class Solution {
    public int minOperations(String[] logs) {
        Stack<String> st=new Stack<>();
        for(String i:logs){
            if(i.equals("../")){
                if(!st.isEmpty()){
                   st.pop();
                }
            }
            else if(i.equals("./")){
                continue;
            }
            else{
                st.push(i);
            }
        }
        return st.size();
    }
}