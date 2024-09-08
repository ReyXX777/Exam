import java.util.*;
import java.util.List;

public class Leetcode93 {
    private final String [] keymapping = {
        "","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
    };
    public List<String> lettercombination(String digits){
        List<String> ans = new ArrayList<>();
        if(digits.isEmpty()) return ans;
        comborecursive(digits,0,"",ans);
        return ans;
    }
    private void comborecursive(String digits,int idx,String asf,List<String>ans){
        if(idx==digits.length()){
            ans.add(asf);
            return;
        }
        char firstdigits = digits.charAt(idx);
        String key = keymapping[firstdigits-'0'];
        for(char ch:key.toCharArray()){
            comborecursive(digits,idx+1,asf+ch,ans);

        }
    }
    public static void main(String [] args){
        Leetcode93 solution = new Leetcode93();
        String digits = "23";
        List<String> result =solution.lettercombination(digits);
        System.out.println(result);
    }
    
}
