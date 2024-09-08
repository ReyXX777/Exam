public class Leetcode109 {
    public int[] search(int [] nums,int target){
        int l = firstgreater(nums,target);
        if(l==nums.length||nums[l]!=target)
        return new int [] { -1,-1};
        int r = firstgreater(nums,target+1)-1;
        return new int[]{l,r};

    }
    private int firstgreater(int [] a,int target){
        int l=0;
        int r = a.length;
        while(l<r){
            int m=(l+r)/2;
            if(a[m]>=target)
            r=m;
            else
            l=m+1;


        }
        return l;
    }
    public static void main(String [] args){
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        Leetcode109 solution = new Leetcode109();
        int [] result = solution.search(nums, target);
        System.out.println("Target range: [" + result[0] + ", " + result[1] + "]");

    }
    
}
