import java.util.Scanner;
public class Value {
    public static void main (String [] args){
       /*  int ch1 = 'a';
        int ch2 = 'b';
        int ch3 = '$';
        System.out.println(+ch1);
        System.out.println(+ch2);
        System.out.println(+ch3);*/
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the character");
        char ch = sc.next().charAt(0);
        int asciivalue = ch;
        System.out.println(+asciivalue);


    }
}