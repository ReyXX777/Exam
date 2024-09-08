import java.util.Scanner;
public class Leetcode20 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the count of words");
        String input = in.nextLine();
        String output = reverse(input);
        System.out.println("reversed string");
        System.out.print(output);
    
}
public static String reverse(String s){
    if(s==null) return null;
    String [] words = s.trim().split("\\s+");
    StringBuilder reversed = new StringBuilder();
    for(int i=words.length-1;i>=0;i--){
        reversed.append(words[i]);
        if(i>0){
            reversed.append(" ");
        }
    }
    return reversed.toString();
}
}
