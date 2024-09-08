import java.util.Scanner;
public class Stringsdivide {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string");
        String str = in.nextLine();
        int length = str.length();
        System.out.println("enter num of parts to divide");
        int n = in.nextInt();
        if (length%n !=0){
System.out.println("cannot be divided");
        }else {
            int partsize = length/n;
            String [] parts = new String[n];
            for (int i=0;i<n;i++){
                parts[i] = str.substring(i*partsize,(i+1)*partsize);
            }
            System.out.println("equal part are");
            for (String part : parts){
                System.out.println(part);
            }
        }
    }
    
}
