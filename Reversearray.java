import java.util.Scanner;
public class Reversearray {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = in.nextInt();
        int [] arr = new int[size];
        System.out.print("enter" + size + " ");
        for ( int i = 0; i<size; i++){
            arr[i]= in.nextInt();

        }
        System.out.println("arrays in reverse order");
        for (int i =size-1;i>=0;i-- ){
            System.out.print(arr[i]);
        }
        }
    
}
