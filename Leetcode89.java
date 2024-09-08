import java.util.*;
public class Leetcode89 {
    public int minmutation(String start,String end,String [] bank){
        Set<String> bankset = new HashSet<>(Arrays.asList(bank));
        if(!bankset.contains(end)){
            return -1;
        }
        int ans = 0;
        Queue<String> q = new ArrayDeque<>(Arrays.asList(start));
        while(!q.isEmpty()){
            ++ans;
            for(int sz=q.size();sz>0;--sz){
                StringBuilder sb = new StringBuilder(q.poll());
                for(int j=0;j<sb.length();++j){
                    final char cache = sb.charAt(j);
                    for(final char c:new char[]{'a','c','g','t'}){
                        sb.setCharAt(j, c);
                        final String word = sb.toString();
                        if(word.equals(end)){
                            return ans;
                        }
                        if(bankset.contains(word)){
                            bankset.remove(word);
                            q.offer(word);
                        }
                    }
                    sb.setCharAt(j,cache);

                }
            }
        }
        return -1;
    }
    public static void main(String [] args){
        Leetcode89 solution = new Leetcode89();
        String start = "AACCGGTT";
    String end = "AAACGGTA";
    String[] bank = {"AACCGGTA", "AACCGCTA", "AAACGGTA"};
    System.out.println(solution.minmutation(start, end, bank));
    }
    
}
