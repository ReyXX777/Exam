import java.util.Arrays;
public class Leetcode180 {
    public int pivot(int [] nums){
        int sum = Arrays.stream(nums).sum();
        int prefix = 0;
        for(int i=0;i<nums.length;++i){
            if(prefix==sum-prefix-nums[i])
            return i;
            prefix += nums[i];
        }
        return -1;
    }
    public static void main(String [] args){
        Leetcode180 solution = new Leetcode180();
        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println(solution.pivot(nums));
    }
    
}
