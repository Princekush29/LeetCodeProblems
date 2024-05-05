package leetCode;

class BestTimetoBuyandSellStock121 {

	public static void main(String[] args) {
		int prices[] = { 7, 1, 5, 3, 6, 4 };
		System.out.println(maxProfit(prices));
	}

	public static int maxProfit(int[] prices) {
		int a = Integer.MAX_VALUE;
		int value = 0, profit = 0;
		for (int i = 0; i < prices.length; i++) {
			if(prices[i]<a) {
				a= prices[i];
			}
			value = prices[i]-a;
			if(profit<value) {
				profit=value;
			}
		}
		return profit;

	}
}