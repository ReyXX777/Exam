import java.util.Scanner;
public class Autobiographical {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number to be checked");
        int num = in.nextInt();
        if (isautoBiographical(num)){
            System.out.println("it is an autobiographic number");
        }else{
            System.out.println("it is not an autobiographic number");
        }
        

        }
        static boolean isautoBiographical(int n){
            String numstring = String.valueOf(n);
            int [] digitcount = new int[10];
            for (char digitchar : numstring.toCharArray()){
                int digit = digitchar - '0';
digitcount[digit]++;

            }
            for (int i =0;i<numstring.length();i++){
                if (digitcount[i]!= numstring.charAt(i) - '0'){
                    return false;
                }
               
            }
return true;
    }
    
}
