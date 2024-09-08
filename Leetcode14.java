import java.util.Scanner;
public class Leetcode14 {
    public static int[] product(int[] arr){
        int length = arr.length;
        int [] answer = new int[length];
        answer[0] = 1;
        for(int i=1;i<length;i++){
            answer[i] = arr[i-1] * answer[i-1];
        }
        int suffix=1;
        for(int i=length-1;i>=0;i--){
            answer[i] *= suffix;
            suffix*= arr[i];
        }
        return answer;
    }
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = in.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();

        }
        int [] resultarray = product(arr);
        System.out.print("output:[");
        for(int i=0;i<resultarray.length;i++){
            System.out.print(resultarray[i]);
            if(i<resultarray.length-1){
System.out.print(",");
            }
        }
        System.out.println("]");
    }
    
}
