import java.util.Arrays;

class Leetcode163{
    public void move(int [] nums){
        int i=0;
        for(int num :nums)
        if(num!=0)
        nums[i++] = num;
        while(i<nums.length)
        nums[i++] = 0;
    }
    public static void main(String [] args){
        Leetcode163 solution = new Leetcode163();
        int [] nums = {0,1,0,3,12};
        solution.move(nums);;
        System.out.println(Arrays.toString(nums));
    }
}