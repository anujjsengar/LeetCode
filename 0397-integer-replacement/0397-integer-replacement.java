class Solution {
    int min=Integer.MAX_VALUE;
    public int integerReplacement(int n) {
        replacement(n,0);
        return min;
    }
    public void replacement(long n,int count){
        if(n==1){
            if(min>count){
                min=count;
            }
            return ;
        }
        if(n<1){
            return ;
        }
        if(n%2==0){
            replacement(n/2,count+1);
        }
        else{
            replacement(n+1,count+1);
            replacement(n-1,count+1);
        }
    }
}