public class Leetcode210 {
    public int flips(int a,int b,int c){
        int maxbit = 30;
        int ans = 0;
        for(int i=0;i<maxbit;++i)
        if((c>>i&1)==1)
        ans += ((a>>i&1)==0&&(b>>i&1)==0)?1:0;
        else
        ans += ((a>>i&1)==1?1:0)+((b>>i&1)==1?1:0);
        return ans;
    }
    public static void main(String [] args){
        Leetcode210 solution = new Leetcode210();
        int a=2;
        int b = 6;
        int c = 5;
        int result = solution.flips(a, b, c);
        System.out.println(result);
    }
    
}
