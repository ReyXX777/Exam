import java.util.Arrays;

public class Leetcode134 {
    public int maxprofit(int k,int [] prices){
        if(k>=prices.length/2){
            int sell=0;
            int hold = Integer.MIN_VALUE;
            for(int price:prices){
                sell = Math.max(sell,hold+price);
                hold = Math.max(hold,sell-price);
            }
            return sell;

        }
        int [] sell =new int[k+1];
        int [] hold = new int[k+1];
        Arrays.fill(hold,Integer.MIN_VALUE);
        for(int price:prices)
        for(int i=k;i>0;--i){
            sell[i] = Math.max(sell[i],hold[i]+price);
            hold[i] = Math.max(hold[i],sell[i-1]-price);

        }
        return sell[k];
    }
    public static void main(String [] args){
        int[] prices = {3, 2, 6, 5, 0, 3};
        int k = 2;
        Leetcode134 solution = new Leetcode134();
        int maxprofit = solution.maxprofit(k, prices);
        System.out.println(maxprofit);
    }
    
}
