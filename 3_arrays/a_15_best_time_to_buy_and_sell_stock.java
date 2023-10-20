public class a_15_best_time_to_buy_and_sell_stock {
    
    //ques
    //you are given arrays prices where prices[i] is the price of a 
    //given stock on ith day 
    // you want to maximize your profit by choosing a single day to 
    // buy one stock and choosing a diffrent day in the future to sell that stock
    //return the \maximum profit you can achieve from this transction 
    //if you cannot achieve any profit return 0;


public static int buyAndSellStock(int price[]){

    int buyPrice = Integer.MAX_VALUE;
    int maxProfit = 0;

    for(int i = 0 ; i< price.length ; i++){

        if(buyPrice< price[i]){
            int profit = price[i] - buyPrice;
            maxProfit = Math.max(maxProfit, profit);
        }
        else{
            buyPrice = price[i];

        }

    }

    return maxProfit;

}


    public static void main(String[] args) {
        

        int price [] = {7 ,1,5,3,6,4};

        System.out.println("max profit is "+ buyAndSellStock(price));







    }
}
