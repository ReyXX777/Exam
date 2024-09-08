import java.util.Arrays;

public class Leetcode164 {
    public void color(int [] nums){
        int zero = -1;
        int one = -1;
        int two = -1;
        for(int num:nums)
        if(num==0){
            nums[++two] =2;
            nums[++one] = 1;
            nums[++zero] = 0;
        } else if(num==1){
            nums[++two] = 2;
            nums[++one] = 1;

        }else{
            nums[++two] = 2;
        }
    }
    public static void main(String [] args){
        Leetcode164 solution = new Leetcode164();
        int[] nums = {2,0,2,1,1,0};
        solution.color(nums);
        System.out.println(Arrays.toString(nums));
    }
    
}
