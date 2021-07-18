package Array;

public class Best_Time_to_Buy_and_Sell_Stock_II {
    public static void main(String[] args) {
        int[] prices = new int[] { 3, 2, 5, 8, 1, 9 };

        maxProfit(prices);
    }
    
    public static int maxProfit(int[] prices) {
        int i = 0, buy, sell, profit = 0, N = prices.length - 1;
        while (i < N) {
            while (i < N && prices[i + 1] <= prices[i])
                i++;
            buy = prices[i];

            while (i < N && prices[i + 1] > prices[i])
                i++;
            sell = prices[i];

            profit += sell - buy;
        }
        return profit;
    }
        
    


}
