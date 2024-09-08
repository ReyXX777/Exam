import java.util.Scanner;
public class Squareroot {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number");
        int n = in.nextInt();
        System.out.println("the square root of num " + n + "is" + squareroot(n) );
    }
    public static double squareroot(int num){
        double t;
        double squareRoot = num/2.0;
        do{
            t = squareRoot;
            squareRoot = (t+(num/t))/2.0;

        }while (Math.abs(t-squareRoot)!=0);
        return squareRoot;
    }
    
}
