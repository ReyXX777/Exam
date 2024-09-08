public class Leetcode135{
    public int maxsquare(char[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;
        int [][] dp = new int[m][n];
        int maxlength = 0;
        for(int i=0;i<m;++i)
        for(int j=0;j<n;++j){
        if(i==0||j==0||matrix[i][j]=='0')
        dp[i][j] = matrix[i][j]=='1'?1:0;
        else
        dp[i][j] = Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1])) +1;
        maxlength = Math.max(maxlength,dp[i][j]);

    }
    return maxlength*maxlength;
}
public static void main(String [] args){
    char [] [] matrix = {
        {'1', '0', '1', '0', '0'},
      {'1', '0', '1', '1', '1'},
      {'1', '1', '1', '1', '1'},
      {'1', '0', '0', '1', '0'}
    };
    Leetcode135 solution = new Leetcode135();
    int maxsquare = solution.maxsquare(matrix);
    System.out.println(maxsquare);
}
}