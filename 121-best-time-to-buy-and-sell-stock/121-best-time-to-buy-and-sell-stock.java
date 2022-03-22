class Solution {
    public int maxProfit(int[] prices) {
        int bought = prices[0]; //1
        int maxProfit = 0; //4
        
        for(int i = 1; i < prices.length; i++){
            if(prices[i] > bought){
                if(prices[i] - bought > maxProfit){
                    maxProfit = prices[i] - bought;
                }
            }else if (prices[i] < bought){
                bought = prices[i];
            }
        }
        
        return maxProfit;
    }
}