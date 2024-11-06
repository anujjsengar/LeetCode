class MyStack {
    ArrayList<Integer> st;
    public MyStack() {
        this.st=new ArrayList<>();
    }
    
    public void push(int x) {
        st.add(x);
    }
    
    public int pop() {
        int ele=st.get(st.size()-1);
        st.remove(st.size()-1);
        return ele;
    }
    
    public int top() {
        return st.get(st.size()-1);
    }
    
    public boolean empty() {
        if(st.size()==0){
            return true;
        }
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */