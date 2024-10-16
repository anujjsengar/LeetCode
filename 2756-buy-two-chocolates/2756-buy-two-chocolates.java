class Solution {
    public int buyChoco(int[] prices, int money) {
        if(prices.length<2){
            return money;
        }
        Arrays.sort(prices);
        if(prices[0]+prices[1]>money){
            return money;
        }
        return money-prices[0]-prices[1];
    }
}