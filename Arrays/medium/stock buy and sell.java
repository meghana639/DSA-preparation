//leetcode: 121 (best time to buy and sell stock):
class Main {
    public static int maxprofit(int[] prices){
        int n = prices.length;
        int max_profit = 0;
        int min_price = prices[0];
        for(int i=1;i<n;i++){
            if(prices[i] < min_price){
                min_price = prices[i];
            }
            int profit = prices[i] - min_price;
            max_profit = Math.max(profit,max_profit);
        }
        return max_profit;
    }
    public static void main(String[] args){
        int [] prices = {7,1,5,3,6,4};
        int ans = maxprofit(prices);
        System.out.print(ans);
    }
}

