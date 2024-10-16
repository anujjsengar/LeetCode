class Solution {
    public int buyChoco(int[] prices, int money) {
        //PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        if(prices.length<2){
            return money;
        }
        int min=Integer.MAX_VALUE;
        int secmin=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                secmin=min;
                min=prices[i];
            }
            else if(prices[i]<secmin){
                secmin=prices[i];
            }
        }
        System.out.println(min);
        System.out.println(secmin);
        if(min+secmin>money){
            return money;
        }
        return money-min-secmin;
    }
}