 public class Leetcode179 {
    public int largest(int [] gain){
        int ans = 0;
        int curr = 0;
        for(int g:gain){
            curr += g;
            ans = Math.max(ans,curr);
        }
        return ans;

    }
    public static void main(String [] args){
        Leetcode179 solution = new Leetcode179();
        int[] gain = {-5, 1, 5, 0, -7};
        System.out.println(solution.largest(gain));
    }
    
}
