import java.util.Scanner;
import java.util.Arrays;
public class Leetcode12 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of papers");
        int n = in.nextInt();
        int [] arr = new int[n];
        System.out.println("enter the citations of each paper");
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int result = citation(arr);
        System.out.println("the h index of the person" + result);
    }
    public static int citation(int[] arr){
Arrays.sort(arr);
int result = 0;
for(int i=0;i<arr.length;i++){
    int smaller = Math.min(arr[i],arr.length-i);
    result = Math.max(result,smaller);
}
return result;
    }
    
}
