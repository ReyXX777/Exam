public class Leetcode144 {
    public int maxproduct(int [] nums){
        int ans = nums[0];
        int dpmin = nums[0];
        int dpmax = nums[0];
        for(int i=1;i<nums.length;++i){
            int num = nums[i];
            int prevmin = dpmin;
            int prevmax = dpmax;
            if(num<0){
                dpmin = Math.min(prevmax*num,num);
                dpmax = Math.max(prevmin*num,num);
            }else{
                dpmin = Math.min(prevmin*num,num);
                dpmax = Math.max(prevmax*num,num);
            }

            ans = Math.max(ans, dpmax);

        }
        return ans;

    }
    public static void main(String [] args){
        Leetcode144 solution = new Leetcode144();
        int[] nums = {2, 3, -2, 4};
        System.out.println(solution.maxproduct(nums));
    }
    
}
