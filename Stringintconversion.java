import java.util.Scanner;
public class Stringintconversion {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number");
        String num = in.nextLine();
           // int number = Integer.parseInt(num);
            int number1 = Integer.valueOf(num);
            //System.out.println("the converted number is" + number);
            System.out.println("the converted number to string is" + number1);

        }
  
    }
    

