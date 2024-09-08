import java.util.Scanner;
public class Prime {
    public static void main (String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(" enter the number to be checked");
        int n = s.nextInt();
        if ( isPrime(n)) {
            System.out.println(n + " is a prime number ");}
            else {
                System.out.println( n + " is not a prime number");
            }
        }

public static boolean isPrime(int n)
{
    if (n<=1) {
        return false ;
    }
    for ( int i = 1; i<=Math.sqrt(n); i ++){
        if (n%2==0) {
            return false;
        }
    }
    return true;
}
    




    }
    

