public class Leetcode175 {
    public int longest(int [] nums){
        int ans =0;
        int zeros = 0;
        for(int l=0,r=0;r<nums.length;++r){
            if(nums[r]==0)
            ++zeros;
            while(zeros==2)
            if(nums[l++]==0)
            --zeros;
            ans = Math.max(ans, r-l);
        }
        return ans;


    }
    public static void main(String [] args){
        Leetcode175 solution = new Leetcode175();
        int[] nums = {1, 1, 0, 1, 1, 1, 0, 1, 1};
        System.out.println(solution.longest(nums));
    }
    
}
