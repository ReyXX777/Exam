import java.util.Scanner;
public class Perfectsquare {
    static boolean isPerfect(double n){
        double number = Math.sqrt(n);
        return ((number - Math.floor(number))==0);
    }
  public static void main(String [] args){
    Scanner in = new Scanner(System.in);
    System.out.println("enter the number");
    double num = in.nextDouble();
    if (isPerfect(num)){
        System.out.println("it is a perfect square");
    }else {
        System.out.println("it is not a perfect square");
    }
  }  
}
