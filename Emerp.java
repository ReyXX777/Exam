import java.util.Scanner;
public class Emerp {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number to be checked");
        int num = in.nextInt();
        if (isemirp(num)){
System.out.println("it is an emirp number");
        }else{
            System.out.println("it is not an emirp number");
        }
    }
    static boolean isprime(int n){
        if (n<=1){
            return false;
        }
        for (int i =2;i*i<=n;i++){
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }
    static int reverse(int x){
        int rev = 0;
        while ( x>0){
            rev = (rev*10) + x%10;
            x /= 10;
        }
        return rev;
    }
    static boolean isemirp(int n){
        if (!isprime(n)){
            return false;
        }
        int reversed = reverse(n);
        return n!= reversed && isprime(reversed);
    }
}
