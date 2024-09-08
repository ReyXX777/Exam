import java.util.Scanner;

public class Leetcode6 {
    public int majority(int [] arr){
        int count = 0; int candidate =0;
        for(int num:arr){
            if(count==0){
                candidate = num;
            }
            count += (num == candidate) ? 1:-1;
        }
        return candidate;
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
        Leetcode6 majority = new Leetcode6();
                int newlength = majority.majority(arr);
                System.out.println("the majority element is" +newlength);
    }
    
}
