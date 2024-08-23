class Solution {
    public int reverse(int x) {
       boolean isneg=x>=0?false :true;
       if(isneg){
        x=x*-1;
       }
       long rev=0;
       while(x>0){
        rev=rev*10+x%10;
        x=x/10;
       }
       if(rev<Integer.MIN_VALUE || rev>Integer.MAX_VALUE){
        return 0;
       }
       return isneg?(int) rev*-1:(int)rev;
    }
}