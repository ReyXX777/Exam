import java.util.*;
public class Leetcode160 {
    public int largest(int [] height){
        int ans = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i=0;i<height.length;++i){
            while(!stack.isEmpty()&&(i==height.length||height[stack.peek()]>height[i])){
                int h = height[stack.pop()];
                int w = stack.isEmpty()?i:i-stack.peek()-1;
                ans = Math.max(ans, h*w);
            }
            stack.push(i);

        }
        return ans;
    }
    public static void main(String [] args){
        Leetcode160 solution = new Leetcode160();
        int[] heights = {2, 1, 5, 6, 2, 3};
        System.out.println(solution.largest(heights));
    }
    
}
