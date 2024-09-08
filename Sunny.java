import java.util.Scanner;
public class Sunny {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the sunny number to calculate");
        int num = in.nextInt();
        in.close();
        double sqrt = Math.sqrt(num + 1);
        double floor = Math.floor(sqrt);
        if (sqrt-floor==0){
            System.out.println("it is a sunny number");

        }else {
            System.out.println("it is not a sunny number");
        }
    }
    
}
