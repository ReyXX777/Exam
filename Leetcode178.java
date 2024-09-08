public class Leetcode178 {
    public int longest(int [] nums,int k){
        int ans = 0;
        for(int l=0,r=0;r<nums.length;++r){
            if(nums[r]==0)
            --k;
            while(k<0)
            if(nums[l++]==0)
            ++k;
            ans = Math.max(ans, r-l+1);
        }
        return ans;
    }
    public static void main(String [] args){
        Leetcode178 solution = new Leetcode178();
        int[] nums = {1, 1, 0, 0, 1, 1, 1, 0, 1, 1};
    int k = 2;
    System.out.println(solution.longest(nums, k));
    }
    
}
