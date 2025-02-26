public class Leetcode147 {
    public int longest(String text1,String text2){
        int m = text1.length();
        int n = text2.length();
        int [][] dp = new int[m+1][n+1];
        for(int i=0;i<m;++i)
        for(int j =0; j<n;++j)
        dp[i+1][j+1] = text1.charAt(i)==text2.charAt(j)?1+dp[i][j] :Math.max(dp[i][j+1], dp[i+1][j]);
        return dp[m][n];


    }
    public static void main(String [] args){
        Leetcode147 solution = new Leetcode147();
        String text1 = "abcde";
    String text2 = "ace";
    System.out.println(solution.longest(text1, text2));
    }
    
}
