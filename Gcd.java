import java.util.Scanner;
public class Gcd {
    public static void main(String [] args){
        int a = 90,b=150;
        int gcd = 1;
        for (int i = 1;i<=a && i<=b;++i){
            if (a%i==0 && b%i == 0){
                gcd = i;
            }
        }
        System.out.println("the gcd of two numbers"+gcd);
    }
    
}
