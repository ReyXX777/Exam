import java.util.Scanner;
public class Arrayascending {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number");
        int size = in.nextInt();
        int [ ] arr = new int [size];
        System.out.println("enter" + size + " elements");
        for (int i =0;i<size;i++){
        arr[i ] = in.nextInt();
        }
        for (int i =0; i<size - 1 ;i++){
            for (int j =0 ; j < size - i - 1; j++){
                if (arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("arrays in ascending order");
        for ( int num : arr){
            System.out.print(num + " ");
        }
    }
    
}
