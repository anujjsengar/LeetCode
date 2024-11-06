class Solution {
    public double myPow(double x, int n) {
        if(n<0){
            x=1/x;
            n=-n;
        }
        return p(x,n);
    }
    public static double p(double x, int n){
        if(n==0){
            return 1;
        }
        double h=p(x,n/2);
        if(n%2==0){
            return h*h;
        }
        else return h*h*x;

    }
}