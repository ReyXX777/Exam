import java.util.Scanner;
public class Stringreversed {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string");
        String originalstring = in.nextLine();
        String reversedstring = "";
        for (int i = originalstring.length()-1;i>=0;i--){
            reversedstring += originalstring.charAt(i);
        }
        System.out.println("reversed string" + reversedstring);
    }
    
}
