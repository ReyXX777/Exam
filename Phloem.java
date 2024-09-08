import java.util.Scanner;
public class Phloem {
    public static void main(String [] args){
        int extremesum =0; int meansum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number to be checked");
        int num = in.nextInt();
        int n;
        num = Math.abs(num);
        n = num;
        while (n!=0){
            if (n== num || n%10 == num %10){
                 extremesum += n%10;


            }else {
                meansum += n%10;
            }
n /= 10;
System.out.println("the extreme sum ="+ extremesum);
System.out.println("the mean sum ="+ meansum);
if (extremesum == meansum){
    System.out.println("it is a pholeam number");
}else {
    System.out.println("it is a xylem number");
}
        }
    }
    
}
