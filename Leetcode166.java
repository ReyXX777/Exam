import java.util.Arrays;

public class Leetcode166 {
    public void permutation(int [] nums){
        int n = nums.length;
        int i;
        for( i=n-2;i>=0;--i)
        if(nums[i]<nums[i+1])
        break;
        if(i>=0)
        for(int j=n-1;j>i;--j)
        if(nums[j]>nums[i]){
            swap(nums,i,j);
            break;
        }
        reverse(nums,i+1,n-1);
    }
    private void reverse(int[] nums,int l,int r){
        while(l<r)
        swap(nums,l++,r--);
    }
    private void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main(String [] args){
        Leetcode166 solution = new Leetcode166();
        int [] nums = {1,2,3};
        solution.permutation(nums);
        System.out.println(Arrays.toString(nums));
    }
    
}
