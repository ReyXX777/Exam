import java.util.Scanner;
public class Leetcode5{
    public static int remove(int[] arr){
if(arr.length==0) return 0;
int i = 0;
for(int n : arr)
    if (i<2|| n>arr[i-2])
        arr[i++] = n;
    
    return i;
}
    
public static void main(String [] args){
    Scanner in = new Scanner(System.in);
    System.out.println("enter the size of the array");
    int size = in.nextInt();
    int [] arr = new int[size];
    System.out.println("enter the elements of the array");
    for(int i=0;i<size;i++){
        arr[i] = in.nextInt();

    }
    int newlength = remove(arr);
    System.out.println("the modified array");
    for(int i=0;i<newlength;i++){
        System.out.print(arr[i] + " ");
    }

    }

}