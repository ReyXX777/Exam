import java.util.Scanner;
public class Spy {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number to be checked");
        int num = in.nextInt();
        int temp = num;
        int sum = 0;
        int product = 1;
        while (temp>0){
            int digit = temp%10;
            sum += digit;
            product *= digit;
            temp /=10;
        }
        if (sum == product){
            System.out.println("it is a spy number");

        }else {
            System.out.println("it is not a spy number");
        }

    }
    
}
