public class Leetcode118 {
    public int hammingweight(int n){
        int ans = 0;
        for(int i=1;i<32;++i){
            if(((n>>i)&1)==1){
                ++ans;
            }
        }
        return ans;
    }
    public static void main(String [] args){
        int input = 11;
        Leetcode118 solution = new Leetcode118();
        int weight = solution.hammingweight(input);
        System.out.println(weight);
    }
    
}
