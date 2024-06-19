/*Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
 */
class Solution {
    public int reverse(int x) {
        if(-Math.pow(2, 31) <= x && x <= (Math.pow(2, 31) - 1)){
        int s=0;
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
        if(s==1){
            r=r*(-1);
        }
        return r;
            }
    else{
        return 0;
    }
    }
}
