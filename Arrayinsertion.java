import java.util.Scanner;
public class Arrayinsertion {
    void sort(int [] array){
        int n = array.length;
        for (int i =1;i<n;i++){
            int key = array[i];
            int j = i-1;
                while (j>=0&& array[j]>key){
                    array[j+1] = array[j];
                    j = j-1;
                }
array[j+1] = key;
            }
        }
        void printarray(int [] array){
        int n = array.length;
        for (int i =0;i<n;i++){
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }
        public static void main(String [] args){
Scanner in = new Scanner(System.in);
System.out.println("enter the size of the array");
int size = in.nextInt();
int [] array = new int [size];
System.out.println("enter the elements of the array");
for (int i=0;i<size;i++){
    array[i] = in.nextInt();


}
Arrayinsertion ob = new Arrayinsertion();
ob.sort(array);
System.out.println("sorted array");
ob.printarray(array);
        }
    }
