package algorithm_easy;

public class MaxTotalProfitOfTheOneStock {
	private static int maxProfit(int prices[]) {
        int total = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - prices[i-1] > 0)
               total += prices[i] - prices[i-1];
        }
        return total;
    }
	
	public static void main(String[] args) {
		int[] prices = {7, 1, 5, 3, 6, 4};
		System.out.println(maxProfit(prices));
	}
}
