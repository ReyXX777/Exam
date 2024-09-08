public class Leetcode207 {
    public int tiling(int n){
        int kmod = 1_000_000_007;
        long[] dp = new long[1001];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 5;
        for(int i=4;i<=n;++i)
        dp[i] = (2*dp[i-1] + dp[i-3] )%kmod;
        return (int) dp[n];
    }
    public static void main(String [] args){
        Leetcode207 solution = new Leetcode207();
        int n=5;
        int result = solution.tiling(n);
        System.out.println(result);
    }
    
}
