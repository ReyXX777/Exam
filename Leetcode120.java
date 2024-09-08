public class Leetcode120 {
    public int singlenumber(int [] nums){
        int ans = 0;
        for(int i=0;i<32;++i){
            int sum=0;
            for(int num:nums)
            sum += num>>i&1;
            sum %= 3;
            ans |= sum<<i;
        }
        return ans;
    }
    public static void main(String [] args){
        int [] nums ={2,2,3,2};
        Leetcode120 solution = new Leetcode120();
        int result = solution.singlenumber(nums);
        System.out.println(result);
    }
    
}
