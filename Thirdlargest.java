import java.util.Scanner;
public class Thirdlargest {
    static int thirdlargest(int [ ] a ,int total ){
        int temp;
        for (int i =0;i<total;i++){
            for (int j = i + 1; j<total;j++){
                if (a[i]>a[j]){
                    temp = a[i];
                    a[i]= a[j];
                    a[j] = temp;
                }
            }
        }
        return a[total - 4];
    }
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = in.nextInt();
        int [] arr = new int[size];
        System.out.println("enter" + size + " elements");
        for ( int i = 0; i<size; i++){
            arr[i] = in.nextInt();

        }
        int thirdlargestt = thirdlargest(arr, size);
        System.out.println("the third largest" + thirdlargestt);
        in.close();
    }
}
