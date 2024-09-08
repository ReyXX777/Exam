import java.util.Scanner;
public class Arraybubble {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = in.nextInt();
        int [] arr = new int[size];
        System.out.println("enter the elements of the array");
        for (int i=0;i<size;i++){
            arr[i]=in.nextInt();
        }
        sortedarray(arr);
        System.out.println("sorted array is");
        for (int i=0;i<size;i++){
            System.out.println(arr[i] + " ");
        }
        in.close();
    }
    public static void sortedarray(int [] array){
        int n = array.length;
        for (int i=0;i<n-1;i++){
for (int j=0;j<n-i-1;j++){
    if (array[j]>array[j+1]){
        int temp = array[j];
        array[j] = array[j+1];
        array[j+1] = temp;

    }
}
        }
    }
}
