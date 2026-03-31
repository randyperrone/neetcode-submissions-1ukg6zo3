class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int currLow = prices[0];
        int currHigh = 0;
        int maxProfit = 0;

        for(int price: prices) {
            if (price < currLow) {
                currLow = price;
                currHigh = 0;
            } else if (price > currLow && price > currHigh) {
                currHigh = price;
                int tempProfit = currHigh - currLow;
                if (tempProfit > maxProfit) 
                    maxProfit = tempProfit;
            }
        }
        return maxProfit;
    }
}
