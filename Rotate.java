import java.util.Scanner;
public class Rotate {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = in.nextInt();
        System.out.println("enter the no of rotation");
        int rotation = in.nextInt();
        int [] arr = new int [size];
        System.out.println("enter" +size + " elements");
        for (int i =0;i<size;i++){
            arr[i] = in.nextInt();

        }
        for(int i = 0; i<rotation;i++){
            int temp = arr[0];
            for (int j=0;j<size-1;j++){
                arr[j]=arr[j+1];

            }arr[size-1]= temp;
        }
        System.out.println("array after rotations");
        for (int i =0 ;i<size;i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
