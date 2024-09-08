import java.util.Scanner;
public class Stringpermutation {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string");
        String str = in.nextLine();
        System.out.println("all permutation are");
        findallpermutation(str, "");
        in.close();
    }
   public static void findallpermutation(String str, String ans){
    if(str.length() == 0){
        System.out.println(ans);
        return;
    }
    for (int i =0;i<str.length(); i++){
        char ch = str.charAt(i);
        String ros = str.substring(0,i) + str.substring(i+1);
        findallpermutation(ros, ans + ch);
    }
   } 
}
