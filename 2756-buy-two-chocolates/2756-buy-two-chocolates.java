class Solution {
    public int buyChoco(int[] prices, int money) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        if(prices.length<2){
            return money;
        }
        for(int i=0;i<prices.length;i++){
            pq.add(prices[i]);
            while(pq.size()>2){
                pq.poll();
            }
        }
        int x=pq.poll();
        int y=pq.poll();
        if(x+y>money){
            return money;
        }
        return money-x-y;
    }
}