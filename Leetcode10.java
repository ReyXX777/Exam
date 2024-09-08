import java.util.Scanner;
public class Leetcode10 {
    public static boolean canJump(int [] arr){
        int maxreach = 0;
        for(int i=0;i<arr.length;i++){
            if(i>maxreach){
                return false;
            }
            maxreach = Math.max(maxreach,i+arr[i]);
        }
        return maxreach>=arr.length-1;
    }
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the num of elements");
        int n = in.nextInt();
        int [] arr = new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        boolean result = canJump(arr);
        System.out.println("the result is" + result);
    }
    
}
