import java.util.Scanner;
public class Large {
    public static void main(String [] args){
        int a ,b,c,temp,largest;
        Scanner in = new Scanner(System.in);
        System.out.println("enter the first number");
        a = in.nextInt();
        System.out.println("enter the second number");
        b = in.nextInt();
        System.out.println("enter the third number");
        c = in.nextInt();
        temp = (a > b) ? a : b;
        largest = (temp > c) ? temp : c;
        System.out.println("the largest of three numbers ="+largest);
    }
}
