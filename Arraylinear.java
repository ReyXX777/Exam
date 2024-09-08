import java.util.Scanner;
public class Arraylinear{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of the element");
        int size = in.nextInt();
        System.out.println("enter the target element");
        int target = in.nextInt();
        
        int [] array = new int[size];
        System.out.println("enter the elements of the array");
        for (int i=0;i<size;i++){
            array[i] = in.nextInt();
        }
int index = findtarget(array,target);
if (index == -1){
    System.out.println("element not found");
}else {
    System.out.println("element is at index" + index);
}

in.close();

    }
    public static int findtarget(int [] array,int target){
        for (int i=0;i<array.length;i++){
            if (array[i] == target){
                return i;
            }
        }
        return -1;
    }
}