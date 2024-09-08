import java.util.Arrays;

public class Leetcode125 {
    public int coinchange(int [] coins,int amount){
        int [] dp = new int[amount+1];
        Arrays.fill(dp,1,dp.length,amount+1);
        for(int coin:coins)
        for(int i=coin;i<=amount;++i)
        dp[i] = Math.min(dp[i],dp[i-coin]+1);
        return dp[amount]==amount+1?-1:dp[amount];

    }
    public static void main(String [] args){
        int [] coins = {1, 2, 5};
        int amount = 11;
        Leetcode125 solution = new Leetcode125();
        int mincoins = solution.coinchange(coins, amount);
        System.out.println(mincoins);
    }
}
