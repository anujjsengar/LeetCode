class Solution {
    public long[] sumOfThree(long num) {
        if(num%3!=0){
            return new long[0];
        }
        long[] arr=new long[3];
        arr[0]=num/3-1;
        arr[1]=num/3;
        arr[2]=num/3+1;
        return arr;
    }
}