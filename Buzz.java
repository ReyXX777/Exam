import java.util.Scanner;
public class Buzz {
    static boolean isbuzznumber(int n){
        return (n%10 == 0 || n%7==0);
            
    
    }
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number to check");
        int number = in.nextInt();
        if (isbuzznumber(number)){
            System.out.println("it is a buzz number");
        }else {
            System.out.println("it is not a buzz number");
        }
    }
    
}
