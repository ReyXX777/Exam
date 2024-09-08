import java.util.Scanner;

public class Patternspiral {
    // Function to print the spiral pattern
    public static void printPattern(int n) {
        int size = 2 * n - 1; // Determines the boundary size of the array
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                // Calculates and prints the values for the pattern
                System.out.print(Math.max(Math.abs(i - n), Math.abs(j - n)) + 1 + " ");
            }
            System.out.println();
        }
    }

    // Main method to drive the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println();
        printPattern(n); // Function call
    }
}
