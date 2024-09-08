public class Leetcode209 {
    public int[] countbits(int n){
        int [] ans = new int [n+1];
        for(int i=1;i<=n;++i)
        ans[i] = ans[i/2] + (i%2);
        return ans;
    }
    public static void main(String [] args){
        Leetcode209 solution = new Leetcode209();
        int n = 5;
        int [] result = solution.countbits(n);
        System.out.println(java.util.Arrays.toString(result));
    }
    
}
