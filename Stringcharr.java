import java.util.Scanner;
public class Stringcharr {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the characters");
        char c = in.next().charAt(0);
        String str = Character.toString(c);
        System.out.print("the converted string is" + str);
        in.close();
    }
    
    
}
