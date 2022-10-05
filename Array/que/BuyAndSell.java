package Array.que;

public class BuyAndSell {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(profit(arr));
    }
    public static int profit(int[] numbers){
        int buyingPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<numbers.length; i++){
            int sellingPrice = numbers[i];
            if(buyingPrice < sellingPrice){
                int profit = sellingPrice - buyingPrice;
                if(profit > maxProfit){
                    maxProfit = profit;
                }
            }
            else{
                buyingPrice = sellingPrice;
            }
        }
        return maxProfit;
    }
}
