public class Leetcode205 {
    public int tribonacci(int n){
        int [] dp = {0,1,1};
        for(int i=3;i<=n;++i)
        dp[i%3] = dp[0] + dp[1] + dp[2];
        return dp[n%3];
    }
    public static void main(String [] args){
        Leetcode205 solution = new Leetcode205();
        int n=4;
        int result = solution.tribonacci(n);
        System.out.println(result);
    }
    
}
