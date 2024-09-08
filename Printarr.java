import java.util.Scanner;
public class Printarr {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = in.nextInt();
        int [ ] arr = new int[size];
        System.out.println("enter" + size + " elements");
        for (int i = 0 ;i<size;i++){
            arr[i] = in.nextInt();
        }
        System.out.println("the elements of the array are");
        for (int i=0;i<size;i++){
System.out.print(arr[i]+" ");
        }
        in.close();
    }
}
