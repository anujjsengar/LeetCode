class Solution {
    public boolean isPalindrome(int x) {
        int s=0;
        int c=x;
        if(x < 0){
            s=1;
            x=x*(-1);
        }
        int n=x;
        int r=0;
        int len=0;
        while(n>0){
            int rem=n%10;
            len=len+1;
            n=n/10;
        }
        while(x>0){
            int rem=x%10;
            r=r+rem*(int)Math.pow(10,len-1);
            len--;
            x=x/10;
        }
        if(c==r){
            return true;
        }
        else{
            return false;
        }
}
}
