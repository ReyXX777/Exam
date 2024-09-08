public class Leetcode133 {
    public int maxprofit(int [] prices){
        int selltwo = 0;
        int holdtwo = Integer.MIN_VALUE;
        int sellone = 0;
        int holdone = Integer.MIN_VALUE;
        for(int price:prices){
            selltwo = Math.max(selltwo,holdtwo+price);
            holdtwo = Math.max(holdtwo,sellone-price);
            sellone = Math.max(sellone,holdone+price);
            holdone = Math.max(holdone,-price);
        }
        return selltwo;

    }
    public static void main(String [] args){
        int[] prices = {3, 2, 6, 5, 0, 3};
        Leetcode133 solution = new Leetcode133();
        int maxprofit = solution.maxprofit(prices);
        System.out.println(maxprofit);
    }
    
}
