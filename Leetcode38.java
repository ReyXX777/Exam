import java.util.HashMap;
import java.util.Scanner;
public class Leetcode38 {
    public static boolean isomorphic(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character> mapS = new HashMap<>();
        HashMap<Character,Character> mapT = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c1 =s.charAt(i);
            char c2 = t.charAt(i);
            if(mapS.containsKey(c1)){
            if(mapS.get(c1)!=c2) return false;
            } else{
                if(mapT.containsKey(c2)) return false;
                mapS.put(c1,c2);
                mapT.put(c2,c1);
            }
        }
        return true;
    }
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter string s");
        String s = in.nextLine();
        System.out.println("enter string t");
        String t = in.nextLine();
        boolean result = isomorphic(s, t);
        System.out.println("the answer"+result);
    }
    
}
