import java.util.Scanner;
public class Stringalphapher {
    public static void main(String [] args){
        int vcount =0;int ccount = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("enter the sentence");
        String str = in.nextLine();
        for (int i =0; i<str.length();i++){
            char str1 = str.charAt(i);
            if (str1 == 'a' || str1 == 'e' || str1 == 'i' || str1 == 'o' || str1 == 'u')
            {
            vcount ++; }else if (str1 >= 'a' && str1 <= 'z'){
                ccount++;
            }
                
            
        }
        System.out.println("number of vowels" + vcount);
        System.out.println("number of consonant" + ccount);
    }
}
