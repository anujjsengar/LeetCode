class Solution {
    public class Node implements Comparable<Node>{
        int[] arr;
        public Node(int num,int deno){
            this.arr=new int[2];
            this.arr[0]=num;
            this.arr[1]=deno;
        }
        public int compareTo(Node b){
            return this.arr[0]*b.arr[1]-b.arr[0]*this.arr[1];
        }
    }
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<Node> pq=new PriorityQueue<>();
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                pq.add(new Node(arr[i],arr[j]));
            }
        }
        while(k-->1){
            pq.poll();
        }
        return pq.peek().arr;
    }
}