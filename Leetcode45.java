import java.util.HashMap;
import java.util.Scanner;
public class Leetcode45 {
    public static boolean duplicate(int [] nums,int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]) && i-map.get(nums[i])<=k){
return true;
            }
            map.put(nums[i],i);
        }
        return false;
    }
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = in.nextInt();
        int [] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = in.nextInt();
        }
        System.out.println("enter the value of k");
        int k = in.nextInt();
        boolean result = duplicate(nums, k);
        System.out.println("the result is" +result);
    }
    
}
