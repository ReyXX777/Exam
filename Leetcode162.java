import java.util.*;
public class Leetcode162 {
    public int[] daily(int [] temp){
        int [] ans = new int[temp.length];
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i=0;i<temp.length;++i){
            while(!stack.isEmpty()&&temp[stack.peek()]>temp[i]){
                int index = stack.pop();
                ans[index] =i-index;

            }
            stack.push(i);
        }
        return ans;
    }
    public static void main(String [] args){
        Leetcode162 solution = new Leetcode162();
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        System.out.println(Arrays.toString(solution.daily(temperatures)));
    }
    
}
