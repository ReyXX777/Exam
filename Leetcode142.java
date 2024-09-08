import java.util.Arrays;
public class Leetcode142 {
    public int maxpath(int m,int n){
        int[][] dp = new int[m][n];
        Arrays.stream(dp).forEach(A->Arrays.fill(A, 1));
        for(int i=1;i<m;++i)
        for(int j=1;j<n;++j)
        dp[i][j] = dp[i-1][j] + dp[i][j-1];
        return dp[m-1][n-1];
    }
    public static void main(String [] args){
        Leetcode142 solution = new Leetcode142();
        int m=3;
        int n=7;
        int result = solution.maxpath(m, n);
        System.out.println(result);
    }
    
}
