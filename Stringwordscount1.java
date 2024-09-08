import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Stringwordscount1 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file path: ");
        String filePath = sc.nextLine();
        
        // Initialize a variable to count the words
        int wordCount = 0;
        
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Split the line into words using whitespace as the delimiter
                String[] words = line.split("\\s+");
                // Increment the word count by the number of words in the line
                wordCount += words.length;
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
        
        // Print the total word count
        System.out.println("Number of words in the given file: " + wordCount);
    }
}
