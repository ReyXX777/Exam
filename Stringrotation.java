import java.util.Scanner;
public class Stringrotation {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter two strings");
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        if (arerotation(str1,str2)){
            System.out.println("it is the rotation string");
        }else {
            System.out.println("it is not a rotation string");
        }
        in.close();
    }
    public static boolean arerotation(String str1,String str2){
        return (str1.length() == str2.length() && (str1+str1).contains(str2));
    }
}
