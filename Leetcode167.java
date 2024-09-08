public class Leetcode167 {
    public String merge(String word1,String word2){
        int n = Math.min(word1.length(),word2.length());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;++i){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));

        }
        return sb.append(word1.substring(n)).append(word2.substring(n)).toString();
    }
    public static void main(String [] args){
        Leetcode167 solution = new Leetcode167();
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(solution.merge(word1, word2));
    }
    
}
