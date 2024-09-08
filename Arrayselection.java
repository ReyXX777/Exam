import java.util.Scanner;

public class Arrayselection {
    // Method to perform selection sort
    void sort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            // Find the minimum element in the unsorted part of the array
            int min_idx = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    // Method to print the array
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main method to test the selection sort with user input
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrayselection ob = new Arrayselection();
        ob.sort(arr);
        System.out.println("Sorted array:");
        ob.printArray(arr);
    }
}
