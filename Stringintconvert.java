import java.util.Scanner;
public class Stringintconvert {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string");
        String str = in.nextLine();
        try{
            double number = Double.parseDouble(str);
            System.out.println("the number is" + number);
        }
        catch (NumberFormatException e){
            System.out.println("format is wrong");
        }
        /*System.out.println("enter the number");
        int str = in.nextInt();
        String number = Integer.toString(str);
        System.out.println("the converted number is" + number);*/

    }
    
}
