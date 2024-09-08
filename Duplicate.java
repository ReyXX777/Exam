import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
public class Duplicate {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = in.nextInt();
         int [] arr = new int[size];
System.out.println("enter" + size + " values");
for(int i=0;i<size;i++){
    arr[i] = in.nextInt();

}
Set<Integer> unique = new HashSet<>();

 Set<Integer> duplicates = new HashSet<>();
for (int val : arr){
    if(!unique.add(val)){
        duplicates.add(val);
    }
}
if (duplicates.isEmpty()){
    System.out.println("no duplicates in the array");
}else {
    System.out.println("duplicates present in the array");
    for (int duplicate : duplicates){
        System.out.println(duplicate + " ");
    }
}
    }
    
}
