public class Leetcode206 {
    public int stairs(int [] cost){
        int n = cost.length;
        for(int i=2;i<n;++i)
        cost[i] += Math.min(cost[i-1],cost[i-2]);
        return Math.min(cost[n-1],cost[n-2]);
    }
    public static void main(String [] args){
        Leetcode206 solution = new Leetcode206();
        int[] cost = {10, 15, 20};
        int result = solution.stairs(cost);
        System.out.println(result);
    }
    
}
