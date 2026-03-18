
package Array;

public class Buy_Sell_Stock {
    public static int buy_sell_stock(int prices[]){
      int buy_price = Integer.MAX_VALUE;
      int max_prof = 0;
      for(int i=0;i<prices.length;i++){
          if(buy_price < prices[i]){
             int prof = prices[i] - buy_price;
             max_prof = Math.max(max_prof, prof);
          }
          if(buy_price>prices[i]){
              buy_price = prices[i];
          }
      }
      
      return max_prof;
    }

    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println("Maximum profit = "+buy_sell_stock(prices));
    }  
}
