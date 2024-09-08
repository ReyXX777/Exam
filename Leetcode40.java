import java.util.Scanner;
import java.util.Arrays;
public class Leetcode40 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string s");
        String s = in.nextLine();
        System.out.println("enter the string t");
        String t = in.nextLine();
        boolean result = isanagram(s,t);
        System.out.println("output" + result);
    }
    public static boolean isanagram(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }
        char [] str1 = s.toCharArray();
        char [] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1,str2);
    }
    
}
