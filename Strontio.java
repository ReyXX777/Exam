import java.util.Scanner;
public class Strontio {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number to be checked");
        int num = in.nextInt();
        int result = num*2;
        int tensdigit = (result%1000)/10;
        if (tensdigit == result%10){
            System.out.println("it is a strontio number");
        }else {
            System.out.println("it is not a strontio number");
        }
    }
    
}
