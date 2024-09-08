public class Leetcode177 {
    public int max(String s,int k){
        int total = 0;
       int length = s.length();
       for(int i=0;i<k;++i){
        if(isvowel(s.charAt(i))){
            ++total;
        }
       }
       int max = total;
       for(int i=k;i<length;++i){
        if(isvowel(s.charAt(i))){
            ++total;
        }
        if(isvowel(s.charAt(i-k))){
            --total;
        }
        max = Math.max(max,total);

       }
       return max;

    }
    private boolean isvowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
    public static void main(String [] args){
         Leetcode177 solution = new Leetcode177();
         String s = "abciiidef";
         int k = 3;
         System.out.println(solution.max(s, k));
    }
    
}
