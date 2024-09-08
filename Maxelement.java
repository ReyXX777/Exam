import java.util.Scanner;
public class Maxelement {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = in.nextInt();
        int [ ] arr = new int[size];
        System.out.println("enter" + size + " elements");
        for(int i =0;i<size;i++){
            arr[i] = in.nextInt();

        }
        int max = arr[0];int sum = 0;
        for (int i =0;i<size;i++){
            if (arr[i]>max){
                max = arr[i];
                 sum += arr[i];
            }
        }
        System.out.println("the largest element of the array" + max);
        System.out.println("the lenth of the array"+ arr.length);
        System.out.println("the sum of the array"+sum);
    }
    
}
