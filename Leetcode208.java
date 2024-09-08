public class Leetcode208 {
    public int profit(int [] prices,int fee){
        int sell = 0;
        int hold = Integer.MIN_VALUE;
        for(int price:prices){
            sell = Math.max(sell,hold+price);
            hold = Math.max(hold,sell-price-fee);

        }
        return sell;
    }
    public static void main(String [] args){
        Leetcode208 solution = new Leetcode208();
        int[] prices = {1, 3, 2, 8, 4, 9};
        int k = 2;
        int result = solution.profit(prices, k);
        System.out.println(result);
    }
    
}
