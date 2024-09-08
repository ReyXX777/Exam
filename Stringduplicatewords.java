import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Stringduplicatewords {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string");
        String str = in.nextLine();
        str = str.toLowerCase();
        String [] words = str.split("\\s+");
        Map<String,Integer> wordcountmap = new HashMap<>();
        for (String word : words){
            if (wordcountmap.containsKey(word)){
                wordcountmap.put(word,wordcountmap.get(word) + 1);
            }else {
                wordcountmap.put(word,1);
            }
        }
        System.out.println("duplicate words in the string");
        for (Map.Entry<String,Integer> entry : wordcountmap.entrySet()){
            if (entry.getValue()>1){
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        }
    }
    
}
