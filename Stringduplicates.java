import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Stringduplicates {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string");
        String str = in.nextLine();
        Map<Character , Integer > charcountmap = new HashMap<>();
        char [] chararray = str.toCharArray();
        for ( char c : chararray ){
            if (charcountmap.containsKey(c)){
                charcountmap.put(c , charcountmap.get(c) + 1);
            }else {
                charcountmap.put(c,1);
            }
        }
        System.out.println("duplicate characters in the string");
        for (Map.Entry<Character,Integer> entry : charcountmap.entrySet()){
            if (entry.getValue()>1){
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
    
}
