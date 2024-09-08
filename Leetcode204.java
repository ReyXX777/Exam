import java.util.ArrayList;
import java.util.List;
public class Leetcode204 {
    public List<List<Integer>> combination(int k,int n){
        List<List<Integer>> ans = new ArrayList<>();
        dfs(k,n,1,new ArrayList<>(),ans);
        return ans;
    }
    private void dfs(int k,int n,int s,List<Integer>path,List<List<Integer>> ans){
        if(k==0&&n==0){
            ans.add(new ArrayList<>(path));
            return;
        }
        if(k==0||n<0)
        return;
        for(int i=s;i<9;++i){
            path.add(i);
            dfs(k-1,n-i,i+1,path,ans);
            path.remove(path.size()-1);
        }
    }
    public static void main(String [] args){
        Leetcode204 solution = new Leetcode204();
        int k = 3;
        int n = 7;
        List<List<Integer>> result = solution.combination(k, n);
        System.out.println(result);
    }
    
}
