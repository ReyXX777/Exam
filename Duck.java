import java.util.Scanner;
public class Duck {
    static boolean isducknum(String number){
        int len = number.length();
        int zeros = 0;
        for (int i =0;i<len;i++){
            char digit = number.charAt(i);
            if (digit == '0'){
                zeros++;
            }
        }
char startdigit = number.charAt(0);
return startdigit !='0' && zeros>0;
    }
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number to be checked");
        String n = in.nextLine();
        if ( isducknum(n)){
            System.out.println("it is a duck number");
        }else {
            System.out.println("it is not a duck number");
        }
    }
}
