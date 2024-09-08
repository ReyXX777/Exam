import java.util.Scanner;
public class Stringbinaryinteger {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the binary number");
        String str = in.nextLine();
        //int converted = Integer.parseInt(str,8);
        int binary = in.nextInt();
        String converted = Integer.toOctalString(binary);
        System.out.println("the converted number is " + converted);
    }
    
}
