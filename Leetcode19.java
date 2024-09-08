import java.util.Scanner;
public class Leetcode19 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the count of strings");
        int n = in.nextInt();
        in.nextLine();
        String[] strs = new String[n]; 
        System.out.println("enter the strings");
        for(int i =0; i<n;i++){
            strs[i] = in.nextLine();
        }
        String result = longest(strs);
        System.out.println("the longest subsequence" +result);
        
        
    }
    public static String longest(String [] strs){
        if(strs.length==0) return "";
        String prefix = strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()) return "";
            }
        }
        return prefix;


    }    
}
