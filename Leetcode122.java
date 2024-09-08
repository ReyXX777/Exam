public class Leetcode122 {
    public int climb(int n){
        int [] dp = new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;++i)
        dp[i] = dp[i-1] + dp[i-2];
        return dp[n];
    }
    public static void main(String [] args){
        int stairs = 5;
        Leetcode122 solution = new Leetcode122();
        int ways = solution.climb(stairs);
        System.out.println(ways);
    }
    
}
