import java.util.Scanner;
public class Stringcharfrequency {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string");
        String str = in.nextLine();
        int [] freq = new int[str.length()];
        char minchar = str.charAt(0), maxchar = str.charAt(0);
        int i,j,min,max;
        char [] string = str.toCharArray();
        for (i=0;i<string.length;i++){
            freq[i] = 1;
            for (j=i+1;j<string.length;j++){
if (string[i] == string[j] && string[i] != ' ' && string[i] != 0){
    freq[i]++;
    string [j] =0;
} 

            }
        }
        min = max =freq[0];
        for (i=0;i<freq.length;i++){
            if (min > freq[i] && freq[i] !=0){
                min = freq[i];
                minchar = string[i];
                
            }
            if (max<freq[i]){
                max = freq[i];
                maxchar = string[i];
            }
        }
        System.out.println("minimum occuring character" + minchar);
        System.out.println("maximum occuring character" + maxchar);
        
    }
}
