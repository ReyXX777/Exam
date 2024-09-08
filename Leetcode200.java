import java.util.PriorityQueue;
import java.util.Queue;
class Leetcode200{
    public long cost(int [] costs,int k,int candidates){
        int ans = 0;
        int i = 0;
        int j = costs.length-1;
        Queue<Integer> minheapl = new PriorityQueue<>();
        Queue<Integer> minheapr = new PriorityQueue<>();
        for(int hired =0;hired<k;++hired){
            while(minheapl.size()<candidates&&i<=j)
            minheapl.offer(costs[i++]);
            while(minheapr.size()<candidates&&i<=j)
            minheapr.offer(costs[j--]);
            if(minheapl.isEmpty())
            ans += minheapr.poll();
            else if(minheapr.isEmpty())
            ans += minheapl.poll();
            else if(minheapl.peek()<=minheapr.peek())
            ans += minheapl.poll();
            else 
            ans += minheapr.poll();
        }
        return ans;

    }
    public static void main(String [] args){
        Leetcode200 solution = new Leetcode200();
        int [] costs = {1, 3, 2, 4, 5};
        int k = 3;
        int candidates = 2;
        long result = solution.cost(costs, k, candidates);
        System.out.println(result);
    }
}