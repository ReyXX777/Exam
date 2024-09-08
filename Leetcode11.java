import java.util.Scanner;
public class Leetcode11 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the num of elements");
        int n = in.nextInt();
        int [] arr = new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        System.out.println("maximum jumps required" + minJumps(arr));

    }
    public static int minJumps(int[] arr){
        if(arr.length<=1) return 0;
        int ladder = arr[0];
        int stairs = arr[0];
        int jump = 1;
        for(int level =1;level<arr.length;level++){
            if(level == arr.length-1){
                return jump;
            }
            ladder = Math.max(ladder,arr[level] + level);
            stairs--;
            if(stairs==0){
                jump++;
                stairs = ladder-level;
            }
        }
        return jump;
    }
}
