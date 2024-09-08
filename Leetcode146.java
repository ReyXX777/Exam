import java.util.Arrays;
public class Leetcode146 {
    public boolean partition(int [] nums){
        int sum =Arrays.stream(nums).sum();
        if(sum%2==1)
        return false;
        return knapsack(nums,sum/2);
    }
    private boolean knapsack(int [] nums,int subset){
        int n = nums.length;
        boolean [][] dp = new boolean[n+1][subset+1];
        dp[0][0] = true;
        for(int i=1;i<=n;++i){
         int num = nums[i-1];
         for(int j=0;j<=subset;++j)
         if(j<num)
         dp[i][j] = dp[i-1][j];
         else 
         dp[i][j] = dp[i-1][j] || dp[i-1][j-num];


    }
    return dp[n][subset];
}
public static void main(String [] args){
    Leetcode146 solution = new Leetcode146();
    int[] nums = {1, 5, 11, 5};
    System.out.println(solution.partition(nums));
}

    
}
