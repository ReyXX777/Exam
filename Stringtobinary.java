import java.util.Scanner;
public class Stringtobinary {
    public static void main(String [] args) {

    Scanner in = new Scanner(System.in);
    System.out.println("enter the string");
    String str = in.nextLine();
    int converted = Integer.parseInt(str, 2);
    System.out.println("the decimal value is" + converted);
    }
    
}
