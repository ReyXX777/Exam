import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
public class Leetcode44 {
    public static boolean ishappy(int n){
        Set<Integer> seennumbers = new HashSet<>();
        while(n!=1&& !seennumbers.contains(n)){
            seennumbers.add(n);
            n = getnumofsquares(n);
        }
        return n==1;
    }
    private static int getnumofsquares(int n){
        int sum =0;
        while(n>0){
            int digit = n%10;
            sum += digit*digit;
            n/=10;

        }
        return sum;
    }
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the num to check");
        int n = in.nextInt();
        boolean result = ishappy(n);
        if(result){
            System.out.println("it is a happy number");
        }else{
            System.out.println("it is not a happy number");
        }
    }
    
}
