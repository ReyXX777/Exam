import java.util.LinkedList;
import java.util.Queue;
public class Leetcode187 {
    private Queue<Integer> q = new LinkedList<>();
    int ping(int t){
        q.offer(t);
        while(q.peek()<t-3000)
        q.poll();
        return q.size();
    }
    public static void main(String [] args){
        Leetcode187 solution = new Leetcode187();
        System.out.println(solution.ping(1));
        System.out.println(solution.ping(100));
        System.out.println(solution.ping(3000));
        System.out.println(solution.ping(3001));
        

    }
    
}
