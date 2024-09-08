import java.util.*;
public class Leetcode158 {
    public int[] sliding(int [] nums,int k){
        int [] ans = new int[nums.length-k+1];
        Deque<Integer> max = new ArrayDeque<>();
        for(int i=0;i<nums.length;++i){
            while(!max.isEmpty()&&max.peekLast()<nums[i])
            max.pollLast();
            max.offerLast(nums[i]);
            if(i>=k&&nums[i-k]==max.peekFirst())
            max.pollFirst();
            if(i>=k-1)
            ans[i-k+1]=max.peekFirst();
        }
        return ans;
    }
    public static void main(String [] args){
        Leetcode158 solution = new Leetcode158();
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        System.out.println(Arrays.toString(solution.sliding(nums, k)));
    }
    
}
