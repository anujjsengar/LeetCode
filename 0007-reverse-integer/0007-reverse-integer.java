class Solution {
    public int reverse(int x) {
        long num=x>=0?x:x*-1;
        long rev=0;
        while(num>0){
            rev=rev*10+num%10;
            num=num/10;
        }
        if(rev>2147483647 || rev<-2147483648){
            return 0;
        }
        return (int)(x>=0?rev:rev*-1);
    }
}