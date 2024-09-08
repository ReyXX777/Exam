import java.util.Scanner;
public class SwapB {
    public static void main(String []args ){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the two numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("the two numbers before swapping" + a + b);
        a = a ^b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("the updated numbers are = " + a +b );
    }
    
}
