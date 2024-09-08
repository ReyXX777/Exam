import java.util.Arrays;
import java.util.Stack;
public class Leetcode186 {
    public int[] asteroid(int [] aster){
        Stack<Integer> stack = new Stack<>();
        for(int a:aster) 
        if(a>0){
            stack.push(a);
        }else{
            while(!stack.isEmpty()&&stack.peek()>0&&stack.peek()<-a)
            stack.pop();
            if(stack.isEmpty()||stack.peek()<0)
            stack.push(a);
            else if(stack.peek()==-a)
            stack.pop();
            else 
            ;
        }
        return stack.stream().mapToInt(Integer::intValue).toArray();

        }
        public static void main(String [] args){
            Leetcode186 solution = new Leetcode186();
            int[] asteroids = {5, 10, -5};
            int [] result = solution.asteroid(asteroids);
            System.out.println(Arrays.toString(result));
        }
    }
    

