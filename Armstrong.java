import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int upperLimit = scanner.nextInt();

        System.out.println("Armstrong numbers up to " + upperLimit + " are:");
        for (int i = 0; i <= upperLimit; i++) {
            if (isArmstrongNumber(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, 5);
            number /= 10;
        }
        return sum == originalNumber;
    }
}
