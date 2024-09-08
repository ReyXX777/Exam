public class Leetcode111 {
    public int min(int [] nums){
        int l=0;
        int r= nums.length -1;
        while(l<r){
            int m = (l+r)/2;
            if(nums[m]<nums[r])
            r = m;
            else
            l= m+1;
        }
        return nums[l];
    }
    public static void main(String [] args){
        int [] nums = {4, 5, 6, 7, 0, 1, 2};
        Leetcode111 solution = new Leetcode111();
        int minelement = solution.min(nums);
        System.out.println(minelement);
    }
}
