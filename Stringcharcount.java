import java.util.Scanner;
public class Stringcharcount {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string");
        String str = in.nextLine();
        int charcount = str.length();
        System.out.println("the number of characters" + charcount);
    }
    
}
