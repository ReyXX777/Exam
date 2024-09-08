import java.util.Scanner;
public class Peterson {
    public static int factorial(int digit){

        if (digit==0 || digit == 1){
            return 1;

        }else {
            return digit *factorial(digit-1);
        }
    }
    static boolean isPeterson(int num){
    int temp = num;
    int sum = 0;
    while (temp>0){
        int digit = temp%10;
        sum += factorial(digit);
    temp /= 10;
    }
    return (sum==num);
}
public static void main (String [] args){
    Scanner in = new Scanner(System.in);
    System.out.println("enter the number to find factorial");
    int n = in.nextInt();
    if (isPeterson(n)){
        System.out.println("yes" + n +" is a peterson sumber");

    }
    else { System.out.println("no" + n +" is not a peterson number");}
}
}

