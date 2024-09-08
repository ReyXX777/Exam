import java.util.Scanner;
public class Leetcode28 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the num of elements");
        int n = in.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        System.out.println("maximum amount" + max(arr));

    }
    public static int max(int [] arr){
        int max =0;
        int leftindex=0;
        int rightindex = arr.length-1;
        while(leftindex<rightindex){
            int currentheight = Math.min(arr[leftindex],arr[rightindex]);
            int width = rightindex - leftindex;
            int currentarea = currentheight*width;
            max = Math.max(max,currentarea);
            if(arr[leftindex] < arr[rightindex]){
                leftindex++;
            }else{
                rightindex--;
            }
        }
        return max;
    }
    
}
