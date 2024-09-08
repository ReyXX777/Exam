import java.util.*;
import java.util.List;
 class Leetcode86 {
    private Map<String,Map<String,Double>> graph = new HashMap<>();
    public double[] calequation(List<List<String>> equations,double[] values,List<List<String>> queries){
        for(int i=0;i<equations.size();i++){
            String a = equations.get(i).get(0);
            String b = equations.get(i).get(1);
            double value = values[i];
            graph.computeIfAbsent(a,k->new HashMap<>()).put(b, value);
            graph.computeIfAbsent(b, k->new HashMap<>()).put(a,1/value);

        }
        double[] result = new double[queries.size()];
        for(int i=0;i<queries.size();i++){
            String c = queries.get(i).get(0);
            String d = queries.get(i).get(1);
            if(!graph.containsKey(c)||!graph.containsKey(d)){
                result[i] = -1.0;


            }else{
                result[i] = dfs(c,d,new HashSet<>(),1.0);
            }
        }
        return result;

    }
    private double dfs(String start,String end,Set<String> visited,double value){
        if(start.equals(end)){
            return value;
        }
        visited.add(start);
        Map<String,Double> neighbor = graph.get(start);
        for(Map.Entry<String,Double> neighbors:neighbor.entrySet()){
            if(!visited.contains(neighbors.getKey())){
                double result = dfs(neighbors.getKey(),end,visited,value*neighbors.getValue());
                if(result!=-1){
                    return result;
                }

            }

        }
        return -1;

    }
    public static void main(String [] args){
        Leetcode86 solution = new Leetcode86();
        List<List<String>> equations = Arrays.asList(
            Arrays.asList("a","b"),
            Arrays.asList("b","c")

        );
        double[] values = {2.0,3.0};
        List<List<String>> queries = Arrays.asList(
            Arrays.asList("a", "c"),
            Arrays.asList("b", "a"),
            Arrays.asList("a", "e"),
            Arrays.asList("a", "a"),
            Arrays.asList("x", "x")
        );
        double[] results = solution.calequation(equations,values,queries);
        System.out.println(Arrays.toString(results));
    }
    
}
