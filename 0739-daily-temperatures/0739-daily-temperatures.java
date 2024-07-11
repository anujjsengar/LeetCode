class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st=new Stack();
        int arr[]=new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            while(!st.isEmpty() && temperatures[i]>temperatures[st.peek()]){
                int k=st.pop();
                arr[k]=i-k;
            }
            st.push(i);
        }
        return arr;
    }
}