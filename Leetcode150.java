import java.util.*;
public class Leetcode150 {
    public int subarray(int [] nums,int k){
        int ans = 0;
        int prefix = 0;
        Map<Integer,Integer> count = new HashMap<>();
        count.put(0, 1);
        for(int num:nums){
            prefix += num;
            ans += count.getOrDefault(prefix-k, 0);
            count.merge(prefix, 1, Integer::sum);

        }
        return ans;

    }
    public static void main(String [] args){
        Leetcode150 solution = new Leetcode150();
        int[] nums = {1, 1, 1};
        int k = 2;
        System.out.println(solution.subarray(nums, k));
    }
    
}
