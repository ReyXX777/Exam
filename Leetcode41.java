import java.util.*;
import java.util.List;
public class Leetcode41 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the num of strings");
        int n = in.nextInt();
        String [] strs = new String[n];
        in.nextLine();
        System.out.println("enter the strings");
        for(int i=0;i<n;i++){
            strs[i] = in.nextLine();

        } 
        
        List<List<String>> result =  groupanagram(strs);
        System.out.println("the list" +result);

    }
    public static List<List<String>> groupanagram(String [] strs){
        if(strs==null||strs.length==0){
            return new ArrayList<>();
        }
        Map<String,List<String>> map = new HashMap<>();
        for(String s:strs){
            char [] chararray = s.toCharArray();
            Arrays.sort(chararray);
            String sorted = new String(chararray);
        
        if(!map.containsKey(sorted)){
map.put(sorted,new ArrayList<>());

        }map.get(sorted).add(s);


    }
    return new ArrayList<>(map.values());    
}
}
