import java.util.Scanner;
public class Leetcode25 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string if it is pallingrome");
        String str = in.nextLine();
        System.out.println("ispallindrome" + isPallindrome(str));
    }
    public static boolean isPallindrome(String s){
        String cleanstString = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        int left = 0;
        int right = cleanstString.length()-1;
        while(left<right){
            if(cleanstString.charAt(left) != cleanstString.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    
}
