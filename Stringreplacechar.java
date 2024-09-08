import java.util.Scanner;
public class Stringreplacechar {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string");
        String str1 = in.nextLine();
        System.out.println("enter the 2nd string");
        String str2 = in.nextLine();
        str1 = str1+str2;
        str2 = str1.substring(0,str1.length() - str2.length());
        str1 = str1.substring(str2.length());
        System.out.println(str1);
        System.out.println(str2);

        }
        
    }
    

