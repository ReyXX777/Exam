import java.util.List;
import java.util.ArrayList;
public class Leetcode98 {
    public List<String> parenthesis(int n){
        List<String> ans = new ArrayList<>();
        dfs(n,n,new StringBuilder(),ans);
        return ans;
    }
    private void dfs(int l,int r,StringBuilder sb,List<String>ans){
        if(l==0&r==0){
            ans.add(sb.toString());
            return;
        }
        if(l>0){
            sb.append("(");
            dfs(l-1,r,sb,ans);
            sb.deleteCharAt(sb.length()-1);

        }
        if(l<r){
            sb.append(")");
            dfs(l,r-1,sb,ans);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public static void main(String [] args){
        int n=3;
        Leetcode98 solution = new Leetcode98();
        List<String> validcombination = solution.parenthesis(n);
        System.out.println(n);
        for(String combination:validcombination){
            System.out.println(combination);
        }
    }
    
}
