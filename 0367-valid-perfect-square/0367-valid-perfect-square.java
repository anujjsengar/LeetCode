class Solution {
    public boolean isPerfectSquare(int num) {
        double ans=Math.pow(num,0.5);
        if(ans==Math.floor(ans)){
            return true;
        }
        return false;
    }
}