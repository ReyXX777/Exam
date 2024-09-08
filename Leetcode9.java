import java.util.Scanner;
public class Leetcode9 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the num of days");
        int n = in.nextInt();
        int [] prices = new int[n];
        System.out.println("enter the price of the stock");
        for(int i=1;i<n;i++){
prices[i] = in.nextInt();

        } 
        int maxProfit = calculate(prices);
        System.out.println("the maximum profit " + maxProfit);
    }
    private static int calculate(int [] prices){
        int maxProfit = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                maxProfit = prices[i] - prices[i-1];
            }
        }
        return maxProfit;
    }

    
}
