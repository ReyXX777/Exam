public class Leetcode117 {
    public int reversebits(int n){
        int ans = 0;
        for(int i=0;i<32;++i){
            if((n>>i&1)==1){
                ans |=1<<(31-i);
            }
        }
        return ans;
    }
    public static void main(String [] args){
        int input = 43261596;
        Leetcode117 solution = new Leetcode117();
        int reversed = solution.reversebits(input);
        System.out.println(reversed);
    }
    
}
