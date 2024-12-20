class Solution {
    public int climbStairs(int n) {
        int[] mem=new int[n+1];
        return climb(n,mem);
    }
    public int climb(int n,int[] mem){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(mem[n]!=0){
            return mem[n];
        }
        mem[n]=climb(n-1,mem)+climb(n-2,mem);
        return mem[n];
    }
}