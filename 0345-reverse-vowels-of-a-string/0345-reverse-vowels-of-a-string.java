class Solution {
    public String reverseVowels(String s) {
        int left=0;
        int right=s.length()-1;
        char[] ch=s.toCharArray();
        while(left<right){
            while(left<right && !check(ch[left])){
                left++;
            }
             while(left<right && !check(ch[right])){
                right--;;
            }
                char temp=ch[left];
                ch[left]=ch[right];
                ch[right]=temp;
            left++;
            right--;
        }
        return new String(ch);
    }
    public boolean check(char c){
        if("aeiouAEIOU".contains(c+"")){
            return true;
        }
        return false;
    }
    
}