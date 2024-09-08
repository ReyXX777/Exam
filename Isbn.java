import java.util.Scanner;
public class Isbn {
    static boolean isIsbn(long n){
        int sum = 0;
        String strnumber = String.valueOf(n);
        if (strnumber.length()>10){
            System.out.println("invalid integer");
        return false;
    
        }    
for (int i =0;i <strnumber.length();i++){
    int intnumber = Character.getNumericValue(strnumber.charAt(i));
    int dnumber = i+1;
    int t = dnumber * intnumber;
    sum += t;



}
return (sum%10==0);
}
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number to be checked");
        long isbnnumber = in.nextLong();
        if (isIsbn(isbnnumber)){
System.out.println("valid isbn");
        }else {
            System.out.println("not valid isbn");
        }
    
}
}
