import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Leetcode47 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the length of the array");
        int n = in.nextInt();
        int [] nums = new int[n];
        System.out.println("enter the elements of the array");
        for(int i=0;i<n;i++){
            nums[i] = in.nextInt();
        }
        List<String> result = range(nums);
        System.out.println("the smallest sorted string");
        for(String str : result){
            System.out.println(str);
        }
    }
    public static List<String> range(int [] nums){
        List<String> list = new ArrayList<>();
        if(nums.length==0){
return list;
        }
        int start = nums[0];
        for(int i=0;i<nums.length;i++){
            if(i==nums.length-1|| nums[i] + 1 != nums[i+1]){
                if(start==nums[i]){
                    list.add(String.valueOf(start));

                }else{
                    list.add(start + "->" + nums[i]);

                }
                if(i!=nums.length-1){
                    start = nums[i+1];
                }
            }
        }
        return list;
    }
    
}
