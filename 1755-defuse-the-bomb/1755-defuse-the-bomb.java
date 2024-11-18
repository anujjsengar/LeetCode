class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        int time=k;
        int[] ans=new int[code.length];
        for(int i=0;i<code.length;i++){
            int sum=0;
            k=time;
            if(k>0){
                while(k>0){
                    if(i+k>=n){
                        sum=sum+code[i+k-n];
                    }
                    else{
                        sum=sum+code[i+k];
                    }
                    System.out.println(sum);
                    k--;
                }
            }
            else{
                while(k<0){
                    if(i+k<0){
                        sum=sum+code[n+(i+k)];
                    }
                    else{
                        sum=sum+code[i+k];
                    }
                    System.out.println(sum);
                    k++;
                }
            }
            ans[i]=sum;
        }
        return ans;
    }
}