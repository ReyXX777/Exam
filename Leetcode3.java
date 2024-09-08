import java.util.Scanner;
public class Leetcode3 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = in.nextInt();
        int [] arr = new int[size];
        System.out.println("enter the elements of the array");
        for(int i=0;i<size;i++){
            arr[i] = in.nextInt();
           
        }
        System.out.println("enter the element to check");
        int n = in.nextInt();
        int newlength = modified(arr,n);
        System.out.println("the new modified array is");
        for(int i=0;i<newlength;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static int modified(int [] arr,int n){
        if(arr.length==0)return 0;
        int i = 0;
        for(int j=1;j<arr.length;j++){
            if(arr[j] != arr[i]){
                i++;
                arr[i] = arr[j];
            }

        }
        return i+1;

    }
    
}
