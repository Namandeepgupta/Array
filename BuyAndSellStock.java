public class BuyAndSellStock {
    public static void main(String args[]){
        int Price[] = {7,1,5,3,6,4};
        int maxProfit = MaxProfitCalculator(Price);
        System.out.print("Maximun Profit: " + maxProfit);
    }
    public static int MaxProfitCalculator(int Price[]){
        int buyingPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<Price.length; i++){
            if(buyingPrice < Price[i]){
                int Profit = Price[i] - buyingPrice;
                maxProfit = Math.max(Profit,maxProfit);
            }
            else{
                buyingPrice = Price[i];
            }
        }
        return maxProfit;
    }
}
