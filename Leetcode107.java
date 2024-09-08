public class Leetcode107 {
    public int peak(int [] nums){
        int l=0;
        int r = nums.length-1;
        while(l<r){
            int m = (l+r)/2;
            if(nums[m]>=nums[m+1])
            r=m;
            else
            l=m+1;
        }
        return l;
    }
    public static void main(String [] args){
        int[] nums = {1, 2, 1, 3, 5, 6, 4};
        Leetcode107 solution = new Leetcode107();
        int index = solution.peak(nums);
        System.out.println(index);
    }
    
}
