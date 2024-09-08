import java.util.Arrays;
import java.util.Scanner;
public class Stringcharanagram {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter first string");
        String str1 = in.nextLine();
        System.out.println("enter second string");
        String str2 = in.nextLine();
        if (areanagrams(str1,str2)){
            System.out.println("both string are equals");
        }else {
            System.out.println("strings are not equal");
        }
        in.close();
    }
        public static boolean areanagrams(String str1,String str2)
        {
            str1 = str1.replaceAll("\\s","").toLowerCase();
            str2 = str2.replaceAll("\\s" , "").toLowerCase();
            if (str1.length() != str2.length()){
return false;
            }
char [] arr1 = str1.toCharArray();
char [] arr2 = str2.toCharArray();
Arrays.sort(arr1);
Arrays.sort(arr2);
return Arrays.equals(arr1,arr2);
        }
    }
    

