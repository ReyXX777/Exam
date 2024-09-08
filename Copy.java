import java.util.Scanner;
public class Copy {
    public static void main (String  [] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println(" enter the string ");
        String str = inp.nextLine();
        for ( int i =0; i<str.length();i++){
            char c = Character.toLowerCase(str.charAt(i));
            { 
                if ( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c== 'u') {
                    System.out.println(" vowel of character " + str.charAt(i) + " " +  "is at position" + " " + (i + 1) );
                }
            }
        }
    }
}
