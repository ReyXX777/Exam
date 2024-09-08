import java.util.Scanner;
public class Rightrotate {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = in.nextInt();
        int [] arr = new int[size];
        System.out.println("enter" + size + " elements");
        for(int i =0 ;i<size;i++){
            arr[i] = in.nextInt();
        }
        System.out.println("enter the number of rotations");
        int rotation = in.nextInt();
        for (int i =0; i<rotation;i++){
int last = arr[size-1];
for (int j = size - 1; j>0;j--){
    arr[j]= arr[j-1];
} arr[0] = last;
        }
        System.out.println("array after right rotation");
        for (int i =0 ;i<size; i++){
            System.out.print(arr[i] + " ");
        }
        in.close();

    }
}
