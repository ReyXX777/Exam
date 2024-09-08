public class Leetcode171 {
    public String reverse(String s){
        StringBuilder sb = new StringBuilder(s);
        int l = 0;
        int r = s.length()-1;
        while(l<r){
            while(l<r&&!isvowel(sb.charAt(l)))
            ++l;
            while(l<r&&!isvowel(sb.charAt(r)))
            --r;
            sb.setCharAt(l, sb.charAt(r));
            sb.setCharAt(r, sb.charAt(l));
            ++l;
            --r;
        }
        return sb.toString();
    }
    private boolean isvowel(char c){
        return "aeiouAEIOU".indexOf(c)!=-1;



    }
    public static void main(String [] args){
        Leetcode171 solution = new Leetcode171();
        String s = "hello";
        System.out.println(solution.reverse(s));
    }
}
