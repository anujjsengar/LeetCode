class Solution {
    public String makeSmallestPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        char[] ch=s.toCharArray();
        while(left<right){
            ch[left]=(char)Math.min(ch[left],ch[right]);
            ch[right]=ch[left];
            left++;
            right--;
        }
        return new String(ch);
    }
}