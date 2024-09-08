import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            int num = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num += i;
            }
            System.out.println();
        }

        scanner.close();
    }
}
