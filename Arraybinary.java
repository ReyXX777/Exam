import java.util.Scanner;
public class Arraybinary {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = in.nextInt();
        int [] array = new int [size];
        System.out.println("enter the elements of the array");
        for (int i =0;i<size;i++){
            array[i] = in.nextInt();
        }
        int target = in.nextInt();
        int index = findarray(array,target);
        if (index == -1){
            System.out.println("element not in the array");
        }else {
            System.out.println("the element is at" + index);
        }
        in.close();
    }
    public static int findarray(int [] array,int target){
        int low =0;
        int high = array.length-1;
        while (low<=high){
           int mid = low + (high - low)/2;
           if (array[mid] ==target){
            return mid;
           } else if (array[mid] < target){
            low = mid + 1;
           }else {
            high = mid - 1;
           }


            
        }
        return -1;
    }
}
