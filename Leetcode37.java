import java.util.Scanner;
public class Leetcode37 {
    public static boolean construct(String ransom,String magazine){
        int [] letters = new int[26];
        for(char c:magazine.toCharArray()){
            letters[c-'a']++;

        }
        for(char c: ransom.toCharArray()){
            if(--letters[c-'a']<0){
                return false;
            }
        }
        return true;
    }
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the ransom note");
        String ransom = in.nextLine();
        System.out.println("enter the magazine");
        String magazine = in.nextLine();
        boolean result = construct(ransom, magazine);
        System.out.println("can construct" +result);
    }
    
}
