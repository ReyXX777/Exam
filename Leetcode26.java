import java.util.Scanner;
public class Leetcode26 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string s");
    String s = in.nextLine();
    System.out.println("enter the t string");
    String t = in.nextLine();
    boolean result = isSub(s,t);
    System.out.println("output" + result);
    }
    public static boolean isSub(String s,String t){
        if(s.length() ==0) return true;
        int indexs =0;
        int indext = 0;
        while(indext<t.length()){
            if(t.charAt(indext) == t.charAt(indexs)){
                indexs++;
                if(indexs==s.length()) return true;
            }
            indext++;
        }
        return false;
    }
}
