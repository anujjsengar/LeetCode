class Solution {
    public int findComplement(int num) {
        int ans=0;
        int x=0;
        while(num>0){
            if(num%2==0){
                ans=ans+(int)Math.pow(2,x);
            }
            x++;
            num=num/2;
        }
        return ans;
    }
}