package LeetCode.SlidingWindow;

public class BestTime {
    public int maxProfit(int[] prices){
        int lastDayPrice = prices[0];
        int maxProfit = 0;
        int possibleProfit = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < lastDayPrice){
                lastDayPrice = prices[i];
            }
            possibleProfit = prices[i] - lastDayPrice;
            if(maxProfit < possibleProfit){
                maxProfit = possibleProfit;
            }
        }
        return maxProfit;
    }
}
