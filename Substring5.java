import java.util.Scanner;
public class Substring5 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string");
        String str = in.nextLine();
        System.out.println("all posible sunstrings are");
        findsubsets(str);
        in.close();
    }
    public static void findsubsets(String str){
        int len = str.length();
        for (int i=0;i<len;i++){
            for (int j =i; j<len;j++){
System.out.println(str.substring(i,j+1));
            }
        }
    }
}
