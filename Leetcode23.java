import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Leetcode23{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string");
        String input = in.nextLine();
        System.out.println("enter the max width of the line");
        int max = in.nextInt();
        in.nextLine();
        String [] words = input.split("\\s");
        List<String> justify = fullJustify(words,max);
        System.out.println("justified text");
        for(String line:justify){
            System.out.println(line);
        }

    }
public static List<String> fullJustify(String [] words ,int maxwidth){
    List<String> result = new ArrayList<>();
    int index = 0;
    while(index<words.length){
        int totalchar = words[index].length();
        int last = index+1;
        while(last<words.length){
            if(totalchar + 1 + words[last].length() >maxwidth) break;
            totalchar += 1+words[last].length();
            last++;

        }
        StringBuilder line = new StringBuilder();
        int num = last - index;
        int spaces = maxwidth-totalchar;
        if(last==words.length||num ==1){
            for(int i=index;i<last;i++){
                line.append(words[i]);
                if(i<last-1) line.append(" ");
            }
            for(int i=line.length();i<maxwidth;i++){
                line.append(" ");
            }
        } else {
            int space = spaces/(num-1);
            int extra = spaces%(num-1);
            for(int i=index;i<last;i++){
                line.append(words[i]);
                if(i<last-1){
                    for (int j = 0; j <= (space + (i - index < extra ? 1 : 0)); j++) {
                        line.append(" ");
                    }
                }

                }
            }
            result.add(line.toString());
            index=last;
        }
        return result;
    }
}
