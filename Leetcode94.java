import java.util.*;
import java.util.List;
public class Leetcode94 {
    public List<List<Integer>> combine(int n,int k){
        List<List<Integer>> ans = new ArrayList<>();
        dfs(n,k,1,new ArrayList<>(),ans);
        return ans;
    }
    private void dfs(int n,int k,int s,List<Integer> path,List<List<Integer>> ans){
        if(path.size()==k){
            ans.add(new ArrayList<>(path));
            return;
        }
        for(int i=s;i<=n;++i){
            path.add(i);
            dfs(n,k,i+1,path,ans);
            path.remove(path.size()-1);
        }
    }
    public static void main(String [] args){
        Leetcode94 solution = new Leetcode94();
        int n=4;
        int k=2;
        List<List<Integer>> result = solution.combine(n,k);
        System.out.println(result);


    }
    
}
