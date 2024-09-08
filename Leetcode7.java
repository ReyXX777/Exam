import java.util.Scanner;
public class Leetcode7 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = in.nextInt();
        int [] arr = new int[size];
        System.out.println("enter the elements of the array");
        for(int i=0;i<size;i++){
            arr[i] = in.nextInt();
        }
        System.out.println("enter the number of rotation");
        int r = in.nextInt();
        rotate(arr,r);
        System.out.println("the rotated array");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
    public static void rotate(int [] arr,int r){
        r %= arr.length;
        reverse(arr,0,arr.length-1);
        reverse(arr,0,r-1);
        reverse(arr,r,arr.length-1);
    }
    public static void reverse(int [] arr,int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
}
