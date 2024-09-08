import java.util.Scanner;
public class Stringcasechange {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string");
        String str = in.nextLine();
        StringBuilder str1 = new StringBuilder(str);
        for (int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if (Character.isLowerCase(ch)){
                str1.setCharAt(i,Character.toUpperCase(ch));

                }else if (Character.isUpperCase(ch)){
                    str1.setCharAt(i,Character.toLowerCase(ch));
                }
            }
            System.out.println("new string" + str1);
            in.close();
        }
    }
    

