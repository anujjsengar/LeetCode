class Solution {
    public void reverseString(char[] s) {
        int pos=-1;
        char[] st=new char[s.length];
        for(int i=0;i<st.length;i++){
            pos++;
            st[pos]=s[i];
        }
        for(int i=0;i<s.length;i++){
            s[i]=st[pos];
            pos--;
        }

}
}