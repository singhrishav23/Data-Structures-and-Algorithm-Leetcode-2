//14 --> Buy & SellStocks

public class Arrays14 {

    public static int BuySellStocks(int price[]){
        int maxP = 0; //Max Profit
        int BP = Integer.MAX_VALUE; //Buy Price

        for (int i = 0; i < price.length; i++) {
            if (BP < price[i]) { //Profit
                int Profit = price[i] - BP;
                maxP = Math.max(maxP, Profit);
            } else {
                BP =price[i];
            }
        }
        return maxP;

    }

    public static void main(String[] args) {

        int price[] = {7, 1, 5, 3, 6, 4};
        int maxProfit = BuySellStocks(price);
        System.out.println(maxProfit);
        
    }
    
}
