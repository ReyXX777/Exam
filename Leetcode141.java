import java.util.Arrays;
public class Leetcode141 {
    public int valid(String s){
        String s2 = ")" + s;
        int [] dp = new int [s2.length()];
        for(int i=1;i<s2.length();++i)
        if(s2.charAt(i)==')' && s2.charAt(i-dp[i-1]-1)=='(')
        dp[i] = dp[i-1] + dp[i-dp[i-1]-2]+2;
        return Arrays.stream(dp).max().getAsInt();

    }
    public static void main(String [] args){
        Leetcode141 solution = new Leetcode141();
        String s = "(()))())(";
        int result = solution.valid(s);
        System.out.println(result);
    }
    
}
