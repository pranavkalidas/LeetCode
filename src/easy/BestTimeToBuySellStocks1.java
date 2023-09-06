package easy;

public class BestTimeToBuySellStocks1 {
    public static void main(String[] args) {
        int[] prices = {7,1,3,6,5};
        System.out.println(maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int profit = -1;
        for (int price : prices) {
            profit = Math.max(profit, price - minPrice);
            minPrice = Math.min(minPrice, price);
        }
        return profit;
    }
}
