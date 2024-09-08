import java.util.Scanner;
public class Leetcode2 {
    public static void main(String  [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = in.nextInt();
        int [] arr = new int[size];
        System.out.println("enter the elements of the array");
        for(int i=0;i<size;i++){
            arr[i] = in.nextInt();
            
        }
        System.out.println("enter the value to be checked");
        int n = in.nextInt();
        int newlength = remove(arr,n);
        System.out.println("modified array");
        for(int i =0;i<newlength;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static int remove(int [] arr ,int n){
        int k =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=n){
                arr[k++] = arr[i];

            }

        }
        return k;
    }
    
}
