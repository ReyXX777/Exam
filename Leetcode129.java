public class Leetcode129 {
    public int uniquepath(int[][] obstacle){
        int m = obstacle.length;
        int n = obstacle[0].length;
        long[][] dp = new long[m+1][n+1];
        dp[0][1] = 1;
        for(int i=1;i<=m;++i)
        for(int j=1;j<=n;++j)
        if(obstacle[i-1][j-1]==0)
        dp[i][j] = dp[i-1][j] + dp[1][j-1];
        return (int)dp[m][n];
    }
    public static void main(String [] args){
        int [][] obstacle = {
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
        };
        Leetcode129 solution = new Leetcode129();
        int uniquepath = solution.uniquepath(obstacle);
        System.out.println(uniquepath);
    }
    
}
