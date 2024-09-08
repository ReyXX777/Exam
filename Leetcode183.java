import java.util.*;
import java.util.List;
public class Leetcode183 {
    public boolean close(String word1,String word2){
        if(word1.length()!=word2.length())
        return false;
        Map<Character,Integer> count1 = new HashMap<>();
        Map<Character,Integer> count2 = new HashMap<>();
        for(char c:word1.toCharArray())
        count1.merge(c, 1, Integer::sum);
        for(char c:word2.toCharArray())
        count2.merge(c, 1, Integer::sum);
        if(!count1.keySet().equals(count2.keySet()))
        return false;
        List<Integer> freq1 = new ArrayList<>(count1.values());
        List<Integer> freq2 = new ArrayList<>(count2.values());
        Collections.sort(freq1);
        Collections.sort(freq2);
        return freq1.equals(freq2);
    }
    public static void main(String [] args){
        Leetcode183 solution = new Leetcode183();
        String word1 = "abc";
        String word2 = "bcab";
        System.out.println(solution.close(word1, word2));
    }
    
}
