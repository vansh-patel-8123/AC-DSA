package Array.Assignment;

public class que3 {
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println(max_profit(arr));
    }
    public static int max_profit(int[] arr){
        int buy_price = arr[0];
        int profit = 0;

       for(int i=1; i<arr.length; i++){     // O(N)
          if(buy_price < arr[i]){
              profit = Math.max(arr[i] - buy_price, profit);
          }
          else{
              buy_price = arr[i];
          }
       }
       return profit;
    }
}
