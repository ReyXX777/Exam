import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Leetcode42 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = in.nextInt();
        int [] num = new int[n];
        System.out.println("enter the elements of the array");
        for(int i=0;i<n;i++){
            num[i] = in.nextInt();
        }
        System.out.println("enter the target element");
        int target = in.nextInt();
        int [] result = check(num,target);
        System.out.println("indices = " + Arrays.toString(result));

    }
    public static int[] check(int [] nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement) ,i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("no two solution");

    }
    
}
