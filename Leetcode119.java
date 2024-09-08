public class Leetcode119 {
    public int singlenumber(int [] nums){
        int ans =0;
        for(int num:nums)
        ans ^= num;
        return ans;
    }
    public static void main(String [] args){
        int [] nums = {2,2,1,3,3};
        Leetcode119 solution = new Leetcode119();
        int result = solution.singlenumber(nums);
        System.out.println(result);
    }
    
}
