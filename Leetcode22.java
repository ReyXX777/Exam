import java.util.Scanner;
public class Leetcode22 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the haystack string");
        String haystack = in.nextLine();
        System.out.println("enter the needle string");
        String needle = in.nextLine();
        int result = str(haystack,needle);
        System.out.println("the result of the method" + result);
    }
    public static int str(String haystack,String needle ){
        if(needle.isEmpty()) return 0;
        for(int i=0;i<=haystack.length() -needle.length();i++){
            if(haystack.substring(i, i+needle.length()).equals(needle)){
return i;
            }
        }

return -1;
    }
    
}
