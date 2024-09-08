import java.util.Scanner;
public class Bouncy {
    static boolean isIncreasing(int num){
        String strnum = String.valueOf(num);
        for (int i=1;i<strnum.length();i++){
if (strnum.charAt(i)< strnum.charAt(i-1)){
    return false;

}
        }
        return true;

    }
 static boolean isDecreasing(int num){
    String strnum = String.valueOf(num);
    for (int i =1;i<strnum.length();i++){
        if (strnum.charAt(i)> strnum.charAt(i-1)){
            return false;
        }
    }
    return true;
 }  
 static boolean isbouncy(int num){
    return !isIncreasing(num)&& !isDecreasing(num);
 } 
 public static void main (String [] args){
    Scanner in = new Scanner(System.in);
    System.out.println("enter the number to be checked");
    int nos = in.nextInt();
    if (isbouncy(nos)){
        System.out.println("it is a bouncy number");
    }else{
        System.out.println("it is not a bouncy number");
    }
 }
}

