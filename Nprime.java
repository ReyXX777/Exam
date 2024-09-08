import java.util.Scanner;
public class Nprime {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number to be checked");
        int num = in.nextInt();
        int n = 1; 
        int count = 0;
        while (count < num){
            n++;
            if (isprime(n)){
                count++;
            }
        }
        System.out.println("the prime at n position =" + n);
    }
    static boolean isprime(int k){
        if (k<=1)
            return false;
            for (int i =2;i*i<=k;i++){
                if (k%i==0){
                    return false;
                }


            }
            return true;
            
        }
        
    }

