import java.util.Scanner;
public class Signum {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number");
        int num = in.nextInt();
        int sign = Integer.signum(num);
if (sign ==1 ){
System.out.println("the number is positive");
}else if (sign == -1){
    System.out.println("the number is negative");
}else {
    System.out.println("the number is zero");
}
    }
    
}
