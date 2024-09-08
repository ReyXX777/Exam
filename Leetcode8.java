import java.util.Scanner;
public class Leetcode8 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the num of days of stock");
        int n = in.nextInt();
        int [] prices = new int[n];
        System.out.println("enter the prices for days");
        for(int i=0;i<n;i++){
            prices[i] = in.nextInt();

        }
        System.out.println("maximum profit" + maxProfit(prices));
    }
    public static int maxProfit(int [] prices){
        if(prices==null||prices.length<1){
            return 0;
        }
        
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int price:prices){
            if(price<minPrice){
                minPrice = price;
            }else if(price-minPrice>maxProfit){
maxProfit = price - minPrice;
            }
           
        }
        return maxProfit;
    }
    
    }

