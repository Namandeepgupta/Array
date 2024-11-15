import java.util.*;

public class Question3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int n = sc.nextInt();
        int price[] = new int [n];
        System.out.print("Enter Price: ");
        for(int i=0; i<n; i++){
            price[i] = sc.nextInt();
        }
        int maxProfit = MaxProfit(price);
        System.out.println("Maximum profit: " + maxProfit);
    }
    public static int MaxProfit(int price[]){
        int maxProfit = 0;
        int buyingPrice = Integer.MAX_VALUE;
        for(int i=0; i<price.length; i++){
            if(buyingPrice < price[i]){
                int profit = price[i] - buyingPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                buyingPrice = price[i];
            }
        }
        return maxProfit;
    }
}
