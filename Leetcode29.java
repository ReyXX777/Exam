import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class Leetcode29 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter number of elements int the array");
        int n = in.nextInt();
        int [] nums = new int[n];
        System.out.println("enter elements of the array");
        for(int i=0;i<n;i++){
            nums[i] = in.nextInt();
        }
        List<List<Integer>> result = threesums(nums);
        System.out.println("triplets sum up to zero");
        for(List<Integer> triplet : result){
            System.out.println(triplet);
        }

    }
    public static List<List<Integer>> threesums(int [] nums){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i>0&&nums[i]==nums[i-1]) continue;
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                int sum = nums[i] + nums[right] + nums[left];
                if(sum==0){
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while(left<right&&nums[left]==nums[left+1])left++;
                    while(left<right&&nums[right]==nums[right-1]) right--;
                    left++;
                    right--;
                }else if(sum<0){
                    left++;
                }else{
                    right--;
                }
            }

        }
        return result;
    }

    
}
