import java.util.Scanner;
public class Fascinating {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number to check");
        int num = in.nextInt();
        if (num<100){
            System.out.println("not an fascinating number");  
            return;     }
           int num1 = num*2;
           int num2 = num*3;
           String concatnum = num + "" + num1 + num2;
           boolean found = true;
           for (char c = '1';c<='9';c++){
            int count = 0;
            for (int i=0;i<concatnum.length();i++){
               char  ch = concatnum.charAt(i);
                 if (ch==c){
                    count++;
                 }
            }
        if (count>1 || count ==0 ){
            found = false;
            break;
        }
    }
        if (found){
            System.out.println(num + " is a fascinating number");
        }else {
            System.out.println(num + " is not a fascinating number");
        }
           }
    }
    

