import java.util.Scanner;
public class Arraycopy {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = in.nextInt();
        int [] arr1 = new int[size];
        int [] arr2 = new int[size];
        System.out.println("enter the elements of first array");
       for ( int i =0;i<size;i++){
        arr1 [i] = in.nextInt();
       }
       for (int i =0; i<size;i++){
        arr2 [i ] = arr1[i];

       }
       System.out.print("the original array elemts");
       for ( int i =0;i<size;i++){
System.out.print(arr1[i] + " ");

       }
       System.out.println();
       System.out.println("elements of arr2");
       for (int i = 0; i<size;i++){
        System.out.print(arr2[i] + " ");
       }
       in.close();
    }
    
}
