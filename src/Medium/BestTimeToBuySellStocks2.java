package Medium;

public class BestTimeToBuySellStocks2 {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i=1; i<prices.length; i++){
            if(prices[i]>prices[i-1]){
                profit = profit + prices[i]-prices[i-1];
            }
        }
        System.gc();
        return profit;
    }
}
