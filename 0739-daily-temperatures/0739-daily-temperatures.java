class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<temp.length;i++){
            while(!st.isEmpty() && temp[i]>temp[st.peek()]){
                int k=st.pop();
                temp[k]=i-k;
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            temp[st.pop()]=0;
        }
        return temp;
    }
}