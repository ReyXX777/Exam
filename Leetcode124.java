import java.util.*;
import java.util.List;
import java.util.HashSet;
class Leetcode124{
    public boolean wordbreak(String s, List<String> dictionary){
        return wordbreak(s,new HashSet<>(dictionary),new HashMap<>());
    }
    private boolean wordbreak(String s, Set<String> wordset,Map<String,Boolean>mem){
        if(mem.containsKey(s))
        return mem.get(s);
        if(wordset.contains(s)){
            mem.put(s, true);
            return true;
        }
        for(int i=1;i<s.length();i++){
            String prefix = s.substring(0,i);
            String suffix = s.substring(i);
            if(wordset.contains(prefix)&&wordbreak(suffix, wordset, mem)){
                mem.put(s, true);
                return true;
            }

        }
        mem.put(s,false);
        return false;
    }
    public static void main(String [] args){
        List<String> dictionary = Arrays.asList("leet", "code", "break", "word");
        String inpustring = "leetcodebreakword";
        Leetcode124 solution = new Leetcode124();
        boolean canbreak = solution.wordbreak(inpustring,dictionary);
        System.out.println(canbreak);
    }
}