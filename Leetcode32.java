import java.util.*;
import java.util.List;
import java.util.HashMap;
import java.util.Scanner;
public class Leetcode32 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the strings");
        String string = in.nextLine();
        System.out.println("enter the num of strings");
        int n = in.nextInt();
        in.nextLine();
        String [] words = new String[n];
        System.out.println("enter the words");
        for(int i=0;i<n;i++){
            words[i] = in.nextLine();
        }
        List<Integer> result = findsub(string,words);
        System.out.println("starting indixes of " + result);

    }
    public static List<Integer> findsub(String s,String [] words){
        List<Integer> indices = new ArrayList<>();
        if(s==null || s.length()==0 ||words==null||words.length ==0){
            return indices;
        }
        int wordlength = words[0].length();
        int totallength = wordlength*words.length;
        Map<String,Integer> wordvalues = new HashMap<>();
        for(String word:words){
            wordvalues.put(word,wordvalues.getOrDefault(word,0)+1);
        }
        for(int i=0;i<=s.length()-totallength;i++){
            if(isValid(s,i,wordvalues,wordlength,words.length)){
                indices.add(i);
            }
        }
        return indices;
    }
    public static boolean isValid(String s,int start,Map<String,Integer> wordvalues,int wordlength,int numwords){
        Map<String,Integer> seen = new HashMap<>();
        for(int j=0;j<numwords;j++){
            int wordstart = start + j*wordlength;
            String word = s.substring(wordstart,wordstart+wordlength);
            if(!wordvalues.containsKey(word)){
                return false;
            }
            seen.put(word,seen.getOrDefault(word,0)+1);
            if(seen.get(word)>wordvalues.get(word)){
                return false;
            }

            }
            return true;

        }
    }
    

