import java.util.HashMap;
import java.util.Scanner;
public class Leetcode39 {
    public static boolean word(String pattern,String s){
        String[] words = s.split(" ");
        if(words.length!=pattern.length()){
            return false;
        }
        HashMap<Character,String> chartostring = new HashMap<>();
        HashMap<String,Character> stringtochar = new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char c = pattern.charAt(i);
            String word = words[i];
            if(!chartostring.containsKey(c)){
                if(stringtochar.containsKey(word)){
                    return false;
                }
                chartostring.put(c,word);
                stringtochar.put(word,c);
            } else{
                if(!chartostring.get(c).equals(word)){
                    return false;
                }
            }
        }
        return true;

    }
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the pattern");
        String pattern = in.nextLine();
        System.out.println("enter the string");
        String s = in.nextLine();
        boolean result = word(pattern,s);
        System.out.println("the string follows" +result);
    }
    
}
