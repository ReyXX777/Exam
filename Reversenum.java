import java.util.Scanner;
public class Reversenum {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number");
        int n = sc.nextInt();
       while(n!=0){

       
        int reverse = 0;
        int remainder = n%10;
        reverse = reverse*10 + remainder;
        n = n / 10;

       
       System.out.print( + reverse);
    }



        
    }
    
}
