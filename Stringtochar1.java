import java.util.Scanner;
public class Stringtochar1 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string");
        String str = in.nextLine();
        char [] array = str.toCharArray();
        System.out.println("the characters of the string are");
        for (char c : array){
            System.out.print(c + " ");
        }
        in.close();
    }
    
}
