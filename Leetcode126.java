import java.util.Arrays;

public class Leetcode126 {
    public int lengthof(int [] nums){
        if(nums.length==0)
        return 0;
        int [] dp = new int[nums.length];
        Arrays.fill(dp,1);
        for(int i=1;i<nums.length;++i)
        for(int j=0;j<i;++j)
        if(nums[j]<nums[i])
        dp[i] = Math.max(dp[i],dp[j]+1);
        return Arrays.stream(dp).max().getAsInt();


    }
    public static void main(String [] args){
        int [] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        Leetcode126 solution = new Leetcode126();
        int lislength = solution.lengthof(nums);
        System.out.println(lislength);
    }
    
    
}
