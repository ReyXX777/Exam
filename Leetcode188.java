import java.util.ArrayDeque;
import java.util.Deque;
public class Leetcode188 {
    public String predict(String senate){
        int total = senate.length();
        Deque<Integer> radiant = new ArrayDeque<>();
        Deque<Integer> dire = new ArrayDeque<>();
        for(int i=0;i<total;++i){
            if(senate.charAt(i)=='R'){
                radiant.offer(i);
            }else {
                dire.offer(i);
            }
        }
        while(!radiant.isEmpty()&&!dire.isEmpty()){
            int radiant1 = radiant.peek();
            int dire1 = dire.peek();
            if(radiant1<dire1){
                radiant.offer(radiant1+total);
            }else {
                dire.offer(dire1+total);
            }
            radiant.poll();
            dire.poll();
        }
        return radiant.isEmpty()?"dire":"radiant";


    }
    public static void main(String [] args){
        Leetcode188 solution = new Leetcode188();
        String senate = "RD";
        System.out.println(solution.predict(senate));
    }
    
}
