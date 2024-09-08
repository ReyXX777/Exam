import java.util.Scanner;
public class Neon1 {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number to be checked");
        int num = in.nextInt();
        int square = num * num ;
        int sum = 0;
        while (square!=0){
            int digit = square%10;
            sum += digit;
            square /= 10;
        }
        if (num==sum){
            System.out.println("it is a neon number");

        } else {
            System.out.println("it is not a neon number");
        }
    }
}