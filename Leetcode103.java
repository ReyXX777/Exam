import java.util.Arrays;

public class Leetcode103 {
    public int maxsubarray(int [] nums){
        int [] dp = new int[nums.length];
        dp[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            dp[i] = Math.max(nums[i],dp[i-1]+nums[i]);

        }
        return Arrays.stream(dp).max().getAsInt();
    }
    public static void main(String [] args){
        int [] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        Leetcode103 solution = new Leetcode103();
        int maxsum = solution.maxsubarray(nums);
        System.out.println(maxsum);
    }
    
}
