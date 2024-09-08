import java.util.*;
import java.util.List;
public class Leetcode196 {
    public boolean visit(List<List<Integer>> rooms){
        int [] seen = new int[rooms.size()];
        dfs(rooms,0,seen);
        return Arrays.stream(seen).allMatch(a->a==1);
    }
    private void dfs(List<List<Integer>> rooms,int node,int [] seen){
        seen[node] = 1;
        for(int child:rooms.get(node))
        if(seen[child]==0)
        dfs(rooms,child,seen);

    }
    public static void main(String [] args){
        Leetcode196 solution = new Leetcode196();
        List<List<Integer>> rooms = new ArrayList<>();
        rooms.add(Arrays.asList(1));
        rooms.add(Arrays.asList(2));
        rooms.add(Arrays.asList(3));
        rooms.add(new ArrayList<>());
        boolean result = solution.visit(rooms);
        System.out.println(result);
    }
    
}
