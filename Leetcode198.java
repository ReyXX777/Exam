import java.util.*;
import java.util.List;
public class Leetcode198 {
    public int reorder(int n,int [][] connections){
        List<Integer> [] graph = new List[n];
        for(int i=0;i<n;++i)
        graph[i] = new ArrayList<>();
        for(int []connection:connections){
            int u = connection[0];
            int v = connection[1];
            graph[u].add(v);
            graph[v].add(-u);
        }
        return dfs(graph,0,-1);
    }
    private int dfs(List<Integer>[] graph,int u,int prev){
        int change = 0;
        for(int v :graph[u]){
            if(Math.abs(v)==prev)
            continue;
            if(v>0)
            ++change;
            change += dfs(graph,Math.abs(v),u);
        }
        return change;

    }
    public static void main(String [] args){
        Leetcode198 solution = new Leetcode198();
        int n = 6;
        int [][] connection = {
            {0, 1},
      {1, 3},
      {2, 3},
      {4, 0},
      {4, 5}
        };
        int result = solution.reorder(n, connection);
        System.out.println(result);
    }
    
}
