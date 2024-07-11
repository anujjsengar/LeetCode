class Solution {
    public void rotate(int[] arr, int k) {
        k=k%arr.length;
        int n=arr.length-1;
            reverse(0,n,arr);
            System.out.println(Arrays.toString(arr));
           // k--;
            reverse(0,k-1,arr);
            System.out.println(Arrays.toString(arr));
            reverse(k,n,arr);
            System.out.println(Arrays.toString(arr));
    }
    public void reverse(int p1,int p2,int[] arr){
        while(p1<p2){
            int temp=arr[p1];
            arr[p1]=arr[p2];
            arr[p2]=temp;
            p1++;
            p2--;
        }
    }
}