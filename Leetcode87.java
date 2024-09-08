import java.util.*;
import java.util.List;
class Sort{
    int n;
    int[] indegree;
    List<Integer>order;
    List<List<Integer>> graph;
    boolean issort = false;
    Sort(List<List<Integer>> graph ,int [] indegree){
        this.graph = graph;
        this.n = graph.size();
        this.indegree = indegree;
        this.order = new ArrayList<>();
        int processnode = 0;
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<n;i++){
            if(indegree[i]==0){
                queue.add(i);
            }
        }
        while(!queue.isEmpty()){
            int u = queue.poll();
            order.add(u);
            for(int v:graph.get(u)){
                if(--indegree[v]==0){
                    queue.add(v);
                }
            }
            processnode++;
        }
        issort = processnode ==n;
    }
}
public class Leetcode87 {
    public boolean canfinish(int numcourses,int [][] prerequisite){
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<numcourses;i++){
            graph.add(new ArrayList<>());
        }
        int [] indegree = new int[numcourses];
        for(int[] prerequisites: prerequisite){
            graph.get(prerequisites[1]).add(prerequisites[0]);
            indegree[prerequisites[0]]++;
        }
        Sort ts = new Sort(graph,indegree);
        return ts.issort;
    }
    public static void main(String [] args){
        Leetcode87 solution = new Leetcode87();
        int numcourses = 4;
        int [][] prerequisite = {
            {1, 0},
            {2, 1},
            {3, 2}
        };
        boolean result = solution.canfinish(numcourses, prerequisite);
        System.out.println("can finish all courses"+result);
    }
    
}
