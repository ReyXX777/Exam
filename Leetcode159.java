import java.util.*;
import java.util.List;
public class Leetcode159 {
    public List<Integer> anagrams(String s,String p){
        List<Integer> ans = new ArrayList<>();
        int[] count = new int[128];
        int required = p.length();
        for(char c:p.toCharArray())
        ++count[c];
        for(int l=0,r=0;r<s.length();++r){
            if(--count[s.charAt(r)]>=0)
            --required;
            while(required==0){
                if(r-l+1==p.length())
                ans.add(l);
                if(++count[s.charAt(l++)]>0)
                ++required;
            }
        }
        return ans;
    }
    public static void main(String [] args){
        Leetcode159 solution = new Leetcode159();
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(solution.anagrams(s,p));
    }
    
}
