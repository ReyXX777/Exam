import java.util.Scanner;
public class Strong {
    static int factorial(int num){
        if (num==0 || num == 1){
            return 1;
        }
        return num * factorial(num-1);
    }
    static boolean isstrong(int number) {
        int temp = number;
        int sum = 0;
        while (temp > 0){
            int digit = temp%10;
            sum += factorial(digit);
            temp /=10;
        }
return sum == number;
    }
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number to be checked");
        int nos = in.nextInt();
        if (isstrong(nos)){
            System.out.println("it is a strong number");

        }
        else {
            System.out.println("it is not a strong number");
        }
    }
}
