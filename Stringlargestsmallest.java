import java.util.Scanner;
public class Stringlargestsmallest {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the sentence");
        String str = in.nextLine();
        String [] words = str.split("\\s+");
        String smallest = words[0];
        String largest = words[0];
        for (String word : words){
            if (word.length()<smallest.length()){
                smallest = word;
            }
            if (word.length()>largest.length()){
                largest = word;
            }
        }
        System.out.println("largest word" + largest);
        System.out.println("smallest word" + smallest);
    }
    
}
