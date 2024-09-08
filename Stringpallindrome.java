import java.util.Scanner;
public class Stringpallindrome {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the string");
        String str = in.nextLine();
        if (ispallindrome(str)){
            System.out.println("it is a pallindrome number");
        }else{
            System.out.println("it is not a pallindrome");
        }
        in.close();
    }
        public static boolean ispallindrome(String str){
            int left =0;
            int right = str.length()-1;
            while (left < right){
                if (str.charAt(left) != str.charAt(right)){
                    return false;
                }
                left ++;
                right --;
            }
            return true;
        }
    }
    

