class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashMap<Integer,Integer> map=new HashMap<>();
        boolean dp[]=new boolean[A.length+1];
        int ans[]=new int[A.length];
        for(int i=0;i<A.length;i++){
            map.put(i,A[i]);
        }
        for(int i=B.length-1;i>=0;i--){
            int ele=B[i];
            int count=0;
            for(int j=i;j>=0;j--){
                if(dp[map.get(j)]==false){
                    count++;
                }
            }
            dp[ele]=true;
            ans[i]=count;
        }
        return ans;
    }
}