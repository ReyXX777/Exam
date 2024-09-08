import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Stringfilewords {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter file path");
        String filepath = in.nextLine();
        Map<String, Integer> wordcountmap = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filepath))){
            String line;
            while ((line = br.readLine())!= null){
                String [] words = line.toLowerCase().split("\\W+");
                for (String word : words){
                    if (wordcountmap.containsKey(word)){
                        wordcountmap.put(word,wordcountmap.get(word)+1);


                        }else {
                            wordcountmap.put(word,1);
                        }
                    }
                }

            } catch ( IOException e){
                System.out.println("en error occured");
                e.printStackTrace();
            }
            String mostrepeatedword = null;
            int maxcount = 0;
            for (Map.Entry<String,Integer> entry : wordcountmap.entrySet()){
                if(entry.getValue()>maxcount){
                    maxcount = entry.getValue();
                    mostrepeatedword= entry.getKey();
                }
            }
            if (mostrepeatedword!=null){
                System.out.println("most repeated words" + mostrepeatedword + " occurences" + maxcount);
            }else {
                System.out.println("no words found in the file");
            }
        }
    }
    

