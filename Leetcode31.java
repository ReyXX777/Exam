import java.util.Scanner;
import java.util.HashSet;
public class Leetcode31 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string");
        String string = in.nextLine();
        in.close();
        System.out.println("The length of the longest substring without repeating characters is " + sub(string));
    }
    public static int sub(String s){
        HashSet<Character> set = new HashSet<>();
        int max = 0;
        int i = 0;
        int j = 0;
        while(j<s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                max = Math.max(max,set.size());

            }else{
                set.remove(s.charAt(i++));
            }

        }
        return max;
    }
    
}
